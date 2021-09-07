package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpExpressDAO;
import com.hd.mall_manager.entity.SpExpress;
@Service
public class SpExpressService{

    @Resource
    private SpExpressDAO spExpressDAO;

    
    public int deleteByPrimaryKey(Integer expressId) {
        return spExpressDAO.deleteByPrimaryKey(expressId);
    }

    
    public int insert(SpExpress record) {
        return spExpressDAO.insert(record);
    }

    
    public int insertSelective(SpExpress record) {
        return spExpressDAO.insertSelective(record);
    }

    
    public SpExpress selectByPrimaryKey(Integer expressId) {
        return spExpressDAO.selectByPrimaryKey(expressId);
    }

    
    public int updateByPrimaryKeySelective(SpExpress record) {
        return spExpressDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpExpress record) {
        return spExpressDAO.updateByPrimaryKey(record);
    }

}
