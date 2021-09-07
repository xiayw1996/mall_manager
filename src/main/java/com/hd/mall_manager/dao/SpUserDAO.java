package com.hd.mall_manager.dao;

import com.hd.mall_manager.entity.SpUser;
import org.apache.ibatis.annotations.Param;

public interface SpUserDAO {
    int deleteByPrimaryKey(Integer userId);

    int insert(SpUser record);

    int insertSelective(SpUser record);

    SpUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SpUser record);

    int updateByPrimaryKey(SpUser record);
}