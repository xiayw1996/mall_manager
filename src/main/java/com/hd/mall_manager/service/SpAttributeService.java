package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpAttributeDAO;
import com.hd.mall_manager.entity.SpAttribute;
@Service
public class SpAttributeService{

    @Resource
    private SpAttributeDAO spAttributeDAO;

    
    public int deleteByPrimaryKey(Short attrId) {
        return spAttributeDAO.deleteByPrimaryKey(attrId);
    }

    
    public int insert(SpAttribute record) {
        return spAttributeDAO.insert(record);
    }

    
    public int insertSelective(SpAttribute record) {
        return spAttributeDAO.insertSelective(record);
    }

    
    public SpAttribute selectByPrimaryKey(Short attrId) {
        return spAttributeDAO.selectByPrimaryKey(attrId);
    }

    
    public int updateByPrimaryKeySelective(SpAttribute record) {
        return spAttributeDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpAttribute record) {
        return spAttributeDAO.updateByPrimaryKey(record);
    }

}
