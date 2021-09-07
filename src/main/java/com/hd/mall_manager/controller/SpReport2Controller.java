package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpReport2Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sr2")
public class SpReport2Controller {

    @Resource
    private SpReport2Service spReport2Service;

    @RequestMapping("/select")
    public ResultVO select(String startDate, String endDate) {
        return spReport2Service.select(startDate, endDate);
    }
}
