package com.hd.mall_manager.util;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 文件工具类
 */
public class FileUtil {

    /**
     * 检测文件路径，不存在就生成这个路径
     * @param filePath  文件路径
     * @return
     */
    public static String safePathCheck(String filePath) {
        File dic = new File(filePath);
        if (!dic.exists()) {
            try {
                //创建这个路径
                FileUtils.forceMkdir(dic);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return filePath;
    }

    /**
     * 根据传进来的路径创建这个文件
     * @param file      文件
     * @param filePath  文件路径
     */
    public static void createFileByPath(MultipartFile file, String filePath) {
        Path path = Paths.get(filePath);
        try {
            //根据路径创建文件
            file.transferTo(Files.createFile(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
