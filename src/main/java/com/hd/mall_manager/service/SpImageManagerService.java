package com.hd.mall_manager.service;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpImageManager;
import com.hd.mall_manager.dao.SpImageManagerDAO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class SpImageManagerService{

    @Resource
    private SpImageManagerDAO spImageManagerDAO;

    @Value("${cacheFile.uploadPath}")
    private String uploadPath;

    @Value("${mallServer.url}")
    private String mallServerUrl;

    
    public int deleteByPrimaryKey(Integer id) {
        return spImageManagerDAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpImageManager record) {
        return spImageManagerDAO.insert(record);
    }

    
    public int insertSelective(SpImageManager record) {
        return spImageManagerDAO.insertSelective(record);
    }

    
    public SpImageManager selectByPrimaryKey(Integer id) {
        return spImageManagerDAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpImageManager record) {
        return spImageManagerDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpImageManager record) {
        return spImageManagerDAO.updateByPrimaryKey(record);
    }


    public List<SpImageManager> selectAll() {
        return spImageManagerDAO.selectAll();
    }

    public void upload(Integer userId, MultipartFile file) {
        SafePathCheck(uploadPath);
        //文件本来的名称
        String fileName = file.getOriginalFilename();
        //截取文件的后缀
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        //自己用uuid生成文件名称
        String newFileName = UUID.randomUUID().toString().replaceAll("-","") + fileType;
        //本地文件路径
        String filePath = uploadPath + "/" + newFileName;
        //图片预览的url
        String fileUrl = mallServerUrl + "/sim/photo/" + newFileName;
        //根据文件路径,获取完整的文件路径
        Path path = Paths.get(filePath);
        try {
            //根据路径创建文件
            file.transferTo(Files.createFile(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        SpImageManager sim = new SpImageManager();
        sim.setFileName(newFileName);
        sim.setFilePath(fileUrl);
        sim.setUploadUserId(userId);
        sim.setCreateTime(LocalDateTime.now());
        //更新用户头像
        spImageManagerDAO.insert(sim);
    }

    /**
     * 假如目录不存在，则新建
     * @param file
     * @return
     */
    public static String SafePathCheck(String file) {
        File dic = new File(file);
        if (!dic.exists()) {
            try {
                FileUtils.forceMkdir(dic);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

}
