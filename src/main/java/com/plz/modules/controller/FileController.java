package com.plz.modules.controller;

import com.plz.modules.emun.ResultEnum;
import com.plz.modules.model.FileModel;
import com.plz.modules.model.Result;
import com.plz.modules.service.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @ClassName: FileController
 * @Description: 文件操作接口
 * @Author: PANLVZ
 * @Date: 2020/9/18
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Resource
    private FileService fileService;

    /**
     * 上传文件(单)
     * @param file 文件
     * @param fileModel
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Result upload(@RequestParam("file") MultipartFile file,
                         @ModelAttribute FileModel fileModel) {
        try {
            fileService.upload(file, fileModel);
            return Result.success(fileModel);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return Result.error(ResultEnum.OPERATION_FAILED);
    }
}
