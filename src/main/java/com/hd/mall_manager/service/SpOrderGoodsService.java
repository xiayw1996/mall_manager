package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpOrderGoodsDAO;
import com.hd.mall_manager.entity.SpOrderGoods;
@Service
public class SpOrderGoodsService{

    @Resource
    private SpOrderGoodsDAO spOrderGoodsDAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spOrderGoodsDAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpOrderGoods record) {
        return spOrderGoodsDAO.insert(record);
    }

    
    public int insertSelective(SpOrderGoods record) {
        return spOrderGoodsDAO.insertSelective(record);
    }

    
    public SpOrderGoods selectByPrimaryKey(Integer id) {
        return spOrderGoodsDAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpOrderGoods record) {
        return spOrderGoodsDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpOrderGoods record) {
        return spOrderGoodsDAO.updateByPrimaryKey(record);
    }

}
