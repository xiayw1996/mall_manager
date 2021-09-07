package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpType;

public interface SpTypeDAO {
    int deleteByPrimaryKey(Short typeId);

    int insert(SpType record);

    int insertSelective(SpType record);

    SpType selectByPrimaryKey(Short typeId);

    int updateByPrimaryKeySelective(SpType record);

    int updateByPrimaryKey(SpType record);
}