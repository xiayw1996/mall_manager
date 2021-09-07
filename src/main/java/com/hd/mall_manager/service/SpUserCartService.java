package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpUserCart;
import com.hd.mall_manager.dao.SpUserCartDAO;
@Service
public class SpUserCartService{

    @Resource
    private SpUserCartDAO spUserCartDAO;

    
    public int deleteByPrimaryKey(Integer cartId) {
        return spUserCartDAO.deleteByPrimaryKey(cartId);
    }

    
    public int insert(SpUserCart record) {
        return spUserCartDAO.insert(record);
    }

    
    public int insertSelective(SpUserCart record) {
        return spUserCartDAO.insertSelective(record);
    }

    
    public SpUserCart selectByPrimaryKey(Integer cartId) {
        return spUserCartDAO.selectByPrimaryKey(cartId);
    }

    
    public int updateByPrimaryKeySelective(SpUserCart record) {
        return spUserCartDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpUserCart record) {
        return spUserCartDAO.updateByPrimaryKey(record);
    }

}
