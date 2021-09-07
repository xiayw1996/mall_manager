package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpExpress;

public interface SpExpressDAO {
    int deleteByPrimaryKey(Integer expressId);

    int insert(SpExpress record);

    int insertSelective(SpExpress record);

    SpExpress selectByPrimaryKey(Integer expressId);

    int updateByPrimaryKeySelective(SpExpress record);

    int updateByPrimaryKey(SpExpress record);
}