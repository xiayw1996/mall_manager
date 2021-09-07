package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpUserDAO;
import com.hd.mall_manager.entity.SpUser;
@Service
public class SpUserService{

    @Resource
    private SpUserDAO spUserDAO;

    
    public int deleteByPrimaryKey(Integer userId) {
        return spUserDAO.deleteByPrimaryKey(userId);
    }

    
    public int insert(SpUser record) {
        return spUserDAO.insert(record);
    }

    
    public int insertSelective(SpUser record) {
        return spUserDAO.insertSelective(record);
    }

    
    public SpUser selectByPrimaryKey(Integer userId) {
        return spUserDAO.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(SpUser record) {
        return spUserDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpUser record) {
        return spUserDAO.updateByPrimaryKey(record);
    }

}
