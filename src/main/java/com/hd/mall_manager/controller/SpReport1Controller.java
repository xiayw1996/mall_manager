package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpReport1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sr1")
public class SpReport1Controller {

    @Resource
    private SpReport1Service spReport1Service;

    @RequestMapping("/select")
    public ResultVO select(String startDate, String endDate) {
        return spReport1Service.select(startDate, endDate);
    }
}
