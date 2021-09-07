package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.service.SpGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sg")
public class SpGoodsController {

    @Resource
    private SpGoodsService spGoodsService;

    @RequestMapping("/goods")
    public PageData selectToPage(PageData pageData, String query) {
        return spGoodsService.selectToPage(pageData, query);
    }
}
