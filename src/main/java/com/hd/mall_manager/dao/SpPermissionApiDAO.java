package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpPermissionApi;

public interface SpPermissionApiDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpPermissionApi record);

    int insertSelective(SpPermissionApi record);

    SpPermissionApi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpPermissionApi record);

    int updateByPrimaryKey(SpPermissionApi record);
}