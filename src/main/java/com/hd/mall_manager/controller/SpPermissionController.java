package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpPermissionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sp")
public class SpPermissionController {

    @Resource
    private SpPermissionService spPermissionService;

    /**
     * 根据类型查询所有记录
     * @param type 类型：0.普通列表 1.树形结构列表
     * @return
     */
    @RequestMapping("/selectAll")
    public ResultVO selectAll(Integer type){
        return new ResultVO(spPermissionService.selectAll(type));
    }
}
