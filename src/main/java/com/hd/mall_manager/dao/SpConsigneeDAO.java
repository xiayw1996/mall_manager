package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpConsignee;

public interface SpConsigneeDAO {
    int deleteByPrimaryKey(Integer cgnId);

    int insert(SpConsignee record);

    int insertSelective(SpConsignee record);

    SpConsignee selectByPrimaryKey(Integer cgnId);

    int updateByPrimaryKeySelective(SpConsignee record);

    int updateByPrimaryKey(SpConsignee record);
}