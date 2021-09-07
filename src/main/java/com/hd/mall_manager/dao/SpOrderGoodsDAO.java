package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpOrderGoods;

public interface SpOrderGoodsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpOrderGoods record);

    int insertSelective(SpOrderGoods record);

    SpOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpOrderGoods record);

    int updateByPrimaryKey(SpOrderGoods record);
}