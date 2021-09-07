package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpAttribute;

public interface SpAttributeDAO {
    int deleteByPrimaryKey(Short attrId);

    int insert(SpAttribute record);

    int insertSelective(SpAttribute record);

    SpAttribute selectByPrimaryKey(Short attrId);

    int updateByPrimaryKeySelective(SpAttribute record);

    int updateByPrimaryKey(SpAttribute record);
}