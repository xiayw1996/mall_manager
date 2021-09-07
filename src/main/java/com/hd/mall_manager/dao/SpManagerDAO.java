package com.hd.mall_manager.dao;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.entity.SpManager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpManagerDAO {
    int deleteByPrimaryKey(Integer mgId);

    int insert(SpManager record);

    int insertSelective(SpManager record);

    SpManager selectByPrimaryKey(Integer mgId);

    int updateByPrimaryKeySelective(SpManager record);

    int updateByPrimaryKey(SpManager record);

    SpManager queryByUserNameAndPwd(@Param("username") String username,
                                    @Param("password") String password);

    int selectToPageTotal(@Param("query") String query);

    List<SpManager> selectToPageList(@Param("pageData") PageData pageData,
                                     @Param("query") String query);

    int checkUserName(@Param("username") String username);

    List<SpManager> selectByRoleId(@Param("roleId") Short roleId);
}