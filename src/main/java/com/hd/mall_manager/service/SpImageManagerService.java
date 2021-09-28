package com.hd.mall_manager.service;

import com.hd.mall_manager.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpImageManager;
import com.hd.mall_manager.dao.SpImageManagerDAO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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


    /**
     * 查询所有记录
     * @return
     */
    public List<SpImageManager> selectAll() {
        return spImageManagerDAO.selectAll();
    }

    /**
     * 图片上传
     * @param userId    用户id
     * @param file      文件
     */
    public void upload(Integer userId, MultipartFile file) {
        //文件本来的名称
        String fileName = file.getOriginalFilename();
        //截取文件的后缀
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        //自己用uuid生成文件名称
        String newFileName = UUID.randomUUID().toString().replaceAll("-","") + fileType;
        //本地文件路径
        String filePath = uploadPath + "/" + newFileName;
        //图片预览的url
        String fileUrl = mallServerUrl + "/" + filePath;


        FileUtil fileUtil = new FileUtil();
        //检测文件路径
        fileUtil.safePathCheck(uploadPath);
        //根据路径创建文件
        fileUtil.createFileByPath(file, filePath);

        //将数据放进图片实体类中
        SpImageManager sim = new SpImageManager();
        sim.setFileName(newFileName);
        sim.setFilePath(fileUrl);
        sim.setUploadUserId(userId);
        sim.setCreateTime(LocalDateTime.now());
        //插入记录
        spImageManagerDAO.insert(sim);
    }

    public int delete(Integer id) {
        SpImageManager sim = spImageManagerDAO.selectByPrimaryKey(id);
        if (sim == null) {
            return 0;
        }
        //先根据图片路径获取图片
        String filePath = uploadPath + "/" + sim.getFileName();
        File file = new File(filePath);
        //如果图片不为空,就删除本地图片
        if (file.isFile() && file.exists()) {
            file.delete();
        }
        return spImageManagerDAO.deleteByPrimaryKey(id);
    }

}
