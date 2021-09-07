package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpReport1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpReport1DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport1 record);

    int insertSelective(SpReport1 record);

    SpReport1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport1 record);

    int updateByPrimaryKey(SpReport1 record);

    List<SpReport1> select(@Param("startDate") String startDate,
                           @Param("endDate") String endDate);
}