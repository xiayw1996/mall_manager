package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpGoodsCatsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品分类
 */
@RestController
@RequestMapping("/sgc")
public class SpGoodsCatsController {

    @Resource
    private SpGoodsCatsService spGoodsCatsService;

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spGoodsCatsService.selectAll());
    }
}
