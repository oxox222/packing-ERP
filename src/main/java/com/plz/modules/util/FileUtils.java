package com.plz.modules.util;

import cn.hutool.core.io.FileTypeUtil;
import com.plz.modules.constant.Constant;
import com.plz.modules.model.FileModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

/**
 * @ClassName: FileUtiles
 * @Description: 文件操作工具类
 * @Author: PANLVZ
 * @Date: 2020/9/18
 */
public class FileUtils {


    /**
     * 上传文件(单)
     * @param file
     * @param fileModel
     * @throws IOException
     */
    public static void upload (MultipartFile file, FileModel fileModel) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("file为空!");
        }

        //原文件名
        String originName = file.getOriginalFilename();
        fileModel.setOriginName(originName);
        InputStream inputStream = new ByteArrayInputStream(file.getBytes());
        //后缀名
        String suffixName = FileTypeUtil.getType(inputStream);
        fileModel.setSuffixName(suffixName);
        //设置文件格式
        setFileType(suffixName, fileModel);
        //源路径
        StringBuilder sb = new StringBuilder(Constant.rootPath);
        //现文件名
        Calendar now = Calendar.getInstance();
        String newName = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
        fileModel.setNewName(newName);
        //根据年月日创建路径
        String path = now.get(Calendar.YEAR) + "/" + now.get(Calendar.MONTH) + "/" + newName;
        sb.append(path);
        //根据类型创建路径
        String type = "";
        switch (fileModel.getFileType().intValue()) {
            case 1:
                type = "/IMAGE";
                break;
            case 2:
                type = "/EXCEL";
                break;
            case 3:
                type = "/WORD";
                break;
            default:
                //type = "/OTHERS";
                break;
        }
        sb.append(type);
        //现文件名
        String nowName = String.valueOf(now.getTimeInMillis());
        //全部路径
        sb.append("/" + nowName + "." + suffixName);
        fileModel.setUrl(sb.toString());
        File targetFile = new File(sb.toString());
        //判断文件父目录是否存在
        if (!targetFile.getParentFile().exists()) {
            targetFile.getParentFile().mkdirs();
        }
        //写入文件
        file.transferTo(targetFile);
    }

    /**
     * 设置文件类型
     * @param type
     */
    public static void setFileType(String type, FileModel fileModel) {
        if (type.equals("jpg") || type.equals("png") || type.equals("jpeg")) {
            //图片
            fileModel.setFileType((byte)1);
        }else if (type.equals("xlsx")) {
            //Excel
            fileModel.setFileType((byte)2);
        }else if (type.equals("doc")) {
            //word
            fileModel.setFileType((byte)3);
        }
    }

}
