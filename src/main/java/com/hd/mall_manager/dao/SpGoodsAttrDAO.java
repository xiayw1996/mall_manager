package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpGoodsAttr;

public interface SpGoodsAttrDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpGoodsAttr record);

    int insertSelective(SpGoodsAttr record);

    SpGoodsAttr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpGoodsAttr record);

    int updateByPrimaryKey(SpGoodsAttr record);
}