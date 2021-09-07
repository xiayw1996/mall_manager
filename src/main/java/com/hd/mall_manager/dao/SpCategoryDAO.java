package com.hd.mall_manager.dao;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.entity.SpCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpCategoryDAO {
    int deleteByPrimaryKey(Integer catId);

    int insert(SpCategory record);

    int insertSelective(SpCategory record);

    SpCategory selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(SpCategory record);

    int updateByPrimaryKey(SpCategory record);

    List<SpCategory> selectAll();

    int selectToPageTotal(@Param("query") String query);

    List<SpCategory> selectToPageList(@Param("pageData") PageData pageData,
                                      @Param("query") String query);
}