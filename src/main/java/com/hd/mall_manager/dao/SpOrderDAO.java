package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpOrder;

import java.util.List;

public interface SpOrderDAO {
    int deleteByPrimaryKey(Integer orderId);

    int insert(SpOrder record);

    int insertSelective(SpOrder record);

    SpOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SpOrder record);

    int updateByPrimaryKey(SpOrder record);

    List<SpOrder> selectAll();
}