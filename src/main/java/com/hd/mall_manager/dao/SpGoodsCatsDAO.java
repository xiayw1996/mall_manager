package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpGoodsCats;

import java.util.List;

public interface SpGoodsCatsDAO {
    int deleteByPrimaryKey(Integer catId);

    int insert(SpGoodsCats record);

    int insertSelective(SpGoodsCats record);

    SpGoodsCats selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(SpGoodsCats record);

    int updateByPrimaryKey(SpGoodsCats record);

    List<SpGoodsCats> selectAll();
}