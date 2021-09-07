package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpUserCart;

public interface SpUserCartDAO {
    int deleteByPrimaryKey(Integer cartId);

    int insert(SpUserCart record);

    int insertSelective(SpUserCart record);

    SpUserCart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(SpUserCart record);

    int updateByPrimaryKey(SpUserCart record);
}