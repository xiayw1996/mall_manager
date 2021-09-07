package com.hd.mall_manager.service;

import com.hd.mall_manager.bean.PageData;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpGoods;
import com.hd.mall_manager.dao.SpGoodsDAO;

import java.util.List;

@Service
public class SpGoodsService{

    @Resource
    private SpGoodsDAO spGoodsDAO;

    
    public int deleteByPrimaryKey(Integer goodsId) {
        return spGoodsDAO.deleteByPrimaryKey(goodsId);
    }

    
    public int insert(SpGoods record) {
        return spGoodsDAO.insert(record);
    }

    
    public int insertSelective(SpGoods record) {
        return spGoodsDAO.insertSelective(record);
    }

    
    public SpGoods selectByPrimaryKey(Integer goodsId) {
        return spGoodsDAO.selectByPrimaryKey(goodsId);
    }

    
    public int updateByPrimaryKeySelective(SpGoods record) {
        return spGoodsDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpGoods record) {
        return spGoodsDAO.updateByPrimaryKey(record);
    }


    public List<SpGoods> selectAll() {
        return spGoodsDAO.selectAll();
    }


    public PageData selectToPage(PageData pageData, String query) {
        pageData.setRecordsTotal(spGoodsDAO.selectToPageTotal(query));
        pageData.setPageData(spGoodsDAO.selectToPageList(pageData, query));
        return pageData;
    }

}
