package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpReport2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpReport2DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SpReport2 record);

    int insertSelective(SpReport2 record);

    SpReport2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpReport2 record);

    int updateByPrimaryKey(SpReport2 record);

    List<SpReport2> select(@Param("startDate") String startDate,
                           @Param("endDate") String endDate);
}