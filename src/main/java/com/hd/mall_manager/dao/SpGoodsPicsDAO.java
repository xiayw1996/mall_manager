package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpGoodsPics;

public interface SpGoodsPicsDAO {
    int deleteByPrimaryKey(Integer picsId);

    int insert(SpGoodsPics record);

    int insertSelective(SpGoodsPics record);

    SpGoodsPics selectByPrimaryKey(Integer picsId);

    int updateByPrimaryKeySelective(SpGoodsPics record);

    int updateByPrimaryKey(SpGoodsPics record);
}