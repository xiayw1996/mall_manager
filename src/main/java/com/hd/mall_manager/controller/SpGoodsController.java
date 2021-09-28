package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.service.SpGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品
 */
@RestController
@RequestMapping("/sg")
public class SpGoodsController {

    @Resource
    private SpGoodsService spGoodsService;

    /**
     * 分页查询
     * @param pageData  分页组件
     * @param query     查询条件
     * @return
     */
    @RequestMapping("/goods")
    public PageData selectToPage(PageData pageData, String query) {
        return spGoodsService.selectToPage(pageData, query);
    }
}
