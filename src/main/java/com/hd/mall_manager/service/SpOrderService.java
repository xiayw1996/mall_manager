package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpOrderDAO;
import com.hd.mall_manager.entity.SpOrder;

import java.util.List;

@Service
public class SpOrderService{

    @Resource
    private SpOrderDAO spOrderDAO;

    
    public int deleteByPrimaryKey(Integer orderId) {
        return spOrderDAO.deleteByPrimaryKey(orderId);
    }

    
    public int insert(SpOrder record) {
        return spOrderDAO.insert(record);
    }

    
    public int insertSelective(SpOrder record) {
        return spOrderDAO.insertSelective(record);
    }

    
    public SpOrder selectByPrimaryKey(Integer orderId) {
        return spOrderDAO.selectByPrimaryKey(orderId);
    }

    
    public int updateByPrimaryKeySelective(SpOrder record) {
        return spOrderDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpOrder record) {
        return spOrderDAO.updateByPrimaryKey(record);
    }


    public List<SpOrder> selectAll() {
        return spOrderDAO.selectAll();
    }

}
