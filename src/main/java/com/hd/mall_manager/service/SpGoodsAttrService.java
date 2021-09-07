package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpGoodsAttrDAO;
import com.hd.mall_manager.entity.SpGoodsAttr;
@Service
public class SpGoodsAttrService{

    @Resource
    private SpGoodsAttrDAO spGoodsAttrDAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spGoodsAttrDAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpGoodsAttr record) {
        return spGoodsAttrDAO.insert(record);
    }

    
    public int insertSelective(SpGoodsAttr record) {
        return spGoodsAttrDAO.insertSelective(record);
    }

    
    public SpGoodsAttr selectByPrimaryKey(Integer id) {
        return spGoodsAttrDAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpGoodsAttr record) {
        return spGoodsAttrDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpGoodsAttr record) {
        return spGoodsAttrDAO.updateByPrimaryKey(record);
    }

}
