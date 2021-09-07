package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpReport3;

public interface SpReport3DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport3 record);

    int insertSelective(SpReport3 record);

    SpReport3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport3 record);

    int updateByPrimaryKey(SpReport3 record);
}