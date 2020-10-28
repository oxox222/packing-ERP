package com.plz.modules.service;

import com.plz.modules.model.FileModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    /**
     * 上传文件(单)
     * @param file 文件
     * @param fileModel
     */
    void upload(MultipartFile file, FileModel fileModel) throws IOException;
}
