package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
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

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spImageManagerService.selectAll());
    }

    /**
     * 图片上传
     * @param userId    用户id
     * @param file      文件
     * @return
     */
    @RequestMapping("/upload")
    public ResultVO upload(Integer userId,
                           @RequestParam(value = "file", required = false) MultipartFile file){
        //用户不能为空
        if(userId == null){
            return new ResultVO(ResultCode.paramNullException);
        }
        //文件不能为空
        if(file == null || file.isEmpty()){
            return new ResultVO(ResultCode.fileNotExistException);
        }
        //调用上传方法
        spImageManagerService.upload(userId,file);
        return new ResultVO();
    }

    /**
     * 图片下载
     * @param res   浏览器返回
     * @param name  图片名称
     * @throws IOException
     */
    @RequestMapping("/download/{name}")
    public void download(HttpServletResponse res, @PathVariable("name") String name) throws IOException {
        //获取图片路径
        String filePath = uploadPath + "/" + name;
        //获取图片所有的byte
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        //设置返回的类型和返回头名称
        res.setContentType("application/octet-stream;charset=UTF-8");
        res.setHeader("Content-Disposition", "attachment; filename=" + new String(name.getBytes("UTF-8"), "ISO-8859-1"));
        //将byte写进输出流
        res.getOutputStream().write(bytes);
    }

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO delete(Integer id) {
        return new ResultVO(spImageManagerService.delete(id));
    }

}
