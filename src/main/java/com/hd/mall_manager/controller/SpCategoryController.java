package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sc")
public class SpCategoryController {

    @Resource
    private SpCategoryService spCategoryService;

    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spCategoryService.selectAll());
    }

    @RequestMapping("/category")
    public PageData selectToPage(PageData pageData, String query) {
        return spCategoryService.selectToPage(pageData, query);
    }
}
