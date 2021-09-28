package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单
 */
@RestController
@RequestMapping("/so")
public class SpOrderController {

    @Resource
    private SpOrderService spOrderService;

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spOrderService.selectAll());
    }
}
