package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpRoleDAO {
    int deleteByPrimaryKey(Short roleId);

    int insert(SpRole record);

    int insertSelective(SpRole record);

    SpRole selectByPrimaryKey(Short roleId);

    int updateByPrimaryKeySelective(SpRole record);

    int updateByPrimaryKey(SpRole record);

    List<SpRole> selectAll();

    int countByName(@Param("roleName") String roleName);
}