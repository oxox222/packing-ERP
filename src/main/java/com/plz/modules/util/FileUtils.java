package com.plz.modules.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: FileUtiles
 * @Description: 文件上传操作类
 * @Author: PANLVZ
 * @Date: 2020/9/18
 */
public class FileUtils {

    public static void upload (MultipartFile file) {
        String fileName = file.getOriginalFilename();

    }
}
