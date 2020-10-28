package com.plz.modules.service.impl;

import com.plz.modules.mapper.FileMapper;
import com.plz.modules.model.FileModel;
import com.plz.modules.service.FileService;
import com.plz.modules.util.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @ClassName: FileServiceImpl
 * @Description: 文件操作业务层
 * @Author: PANLVZ
 * @Date: 2020/9/18
 */
@Service
public class FileServiceImpl implements FileService {

    @Resource
    private FileMapper fileMapper;

    @Override
    public void upload(MultipartFile file, FileModel fileModel) throws IOException {
        //写入文件
        FileUtils.upload(file, fileModel);
        //保存文件信息
        fileMapper.insert(fileModel);
    }
}
