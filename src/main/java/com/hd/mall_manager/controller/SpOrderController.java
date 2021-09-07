package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/so")
public class SpOrderController {

    @Resource
    private SpOrderService spOrderService;

    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spOrderService.selectAll());
    }
}
