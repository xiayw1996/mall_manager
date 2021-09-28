package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.service.SpCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 分类
 */
@RestController
@RequestMapping("/sc")
public class SpCategoryController {

    @Resource
    private SpCategoryService spCategoryService;

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("/selectAll")
    public ResultVO selectAll() {
        return new ResultVO(spCategoryService.selectAll());
    }

    /**
     * 分页查询
     * @param pageData  分页组件
     * @param query     查询条件
     * @return
     */
    @RequestMapping("/category")
    public PageData selectToPage(PageData pageData, String query) {
        return spCategoryService.selectToPage(pageData, query);
    }
}
