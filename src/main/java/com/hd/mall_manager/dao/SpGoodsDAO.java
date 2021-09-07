package com.hd.mall_manager.dao;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.entity.SpGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpGoodsDAO {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(SpGoods record);

    int insertSelective(SpGoods record);

    SpGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(SpGoods record);

    int updateByPrimaryKey(SpGoods record);

    List<SpGoods> selectAll();

    int selectToPageTotal(@Param("query") String query);

    List<SpGoods> selectToPageList(@Param("pageData") PageData pageData,
                                   @Param("query") String query);

}