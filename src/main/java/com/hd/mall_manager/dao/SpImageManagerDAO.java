package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpImageManager;

import java.util.List;

public interface SpImageManagerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpImageManager record);

    int insertSelective(SpImageManager record);

    SpImageManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpImageManager record);

    int updateByPrimaryKey(SpImageManager record);

    List<SpImageManager> selectAll();
}