package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpType;
import com.hd.mall_manager.dao.SpTypeDAO;
@Service
public class SpTypeService{

    @Resource
    private SpTypeDAO spTypeDAO;

    
    public int deleteByPrimaryKey(Short typeId) {
        return spTypeDAO.deleteByPrimaryKey(typeId);
    }

    
    public int insert(SpType record) {
        return spTypeDAO.insert(record);
    }

    
    public int insertSelective(SpType record) {
        return spTypeDAO.insertSelective(record);
    }

    
    public SpType selectByPrimaryKey(Short typeId) {
        return spTypeDAO.selectByPrimaryKey(typeId);
    }

    
    public int updateByPrimaryKeySelective(SpType record) {
        return spTypeDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpType record) {
        return spTypeDAO.updateByPrimaryKey(record);
    }

}
