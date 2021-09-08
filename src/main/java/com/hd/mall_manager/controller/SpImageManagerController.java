package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.entity.SpImageManager;
import com.hd.mall_manager.service.SpImageManagerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/sim")
public class SpImageManagerController {

    @Resource
    private SpImageManagerService spImageManagerService;

    @Value("${cacheFile.uploadPath}")
    private String uploadPath;

    //查询全部
    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spImageManagerService.selectAll());
    }

    //图片上传
    @RequestMapping("/upload")
    public ResultVO upload(Integer userId,
                           @RequestParam(value = "file", required = false) MultipartFile file){
        if(userId == null){
            return new ResultVO(ResultCode.paramNullException);
        }
        if(file == null || file.isEmpty()){
            return new ResultVO(ResultCode.fileNotExistException);
        }
        spImageManagerService.upload(userId,file);
        return new ResultVO();
    }

    //图片下载
    @RequestMapping("/download/{name}")
    public void download(HttpServletResponse res, @PathVariable("name") String name) throws IOException {
        String filePath = uploadPath + "/" + name;
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        res.setContentType("application/octet-stream;charset=UTF-8");
        res.setHeader("Content-Disposition", "attachment; filename=" + new String(name.getBytes("UTF-8"), "ISO-8859-1"));
        res.getOutputStream().write(bytes);
    }

    //图片预览
    @RequestMapping("/photo/{name}")
    public void photo(HttpServletResponse res, @PathVariable("name") String name) throws IOException {
        String filePath = uploadPath + "/" + name;
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        res.getOutputStream().write(bytes);
    }

    //删除
    @RequestMapping("/delete")
    public ResultVO delete(Integer id) {
        return new ResultVO(spImageManagerService.deleteByPrimaryKey(id));
    }

}
