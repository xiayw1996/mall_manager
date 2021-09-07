package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpPermissionDAO {
    int deleteByPrimaryKey(Short psId);

    int insert(SpPermission record);

    int insertSelective(SpPermission record);

    SpPermission selectByPrimaryKey(Short psId);

    int updateByPrimaryKeySelective(SpPermission record);

    int updateByPrimaryKey(SpPermission record);

    List<SpPermission> selectAll();

    List<SpPermission> selectRight(@Param("roleId") Short roleId,
                                   @Param("psId") Short psId,
                                   @Param("psLevel") Object psLevel);

    List<Short> subIdList(@Param("psId") Short psId);

    List<Short> selectNotSubList(@Param("roleId") Short roleId,
                                 @Param("jList") List<Short> jList);

    List<SpPermission> selectRightAll(@Param("psId") Short psId,
                                      @Param("psLevel") Object psLevel);
}