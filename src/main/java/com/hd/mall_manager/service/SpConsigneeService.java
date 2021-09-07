package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpConsignee;
import com.hd.mall_manager.dao.SpConsigneeDAO;
@Service
public class SpConsigneeService{

    @Resource
    private SpConsigneeDAO spConsigneeDAO;

    
    public int deleteByPrimaryKey(Integer cgnId) {
        return spConsigneeDAO.deleteByPrimaryKey(cgnId);
    }

    
    public int insert(SpConsignee record) {
        return spConsigneeDAO.insert(record);
    }

    
    public int insertSelective(SpConsignee record) {
        return spConsigneeDAO.insertSelective(record);
    }

    
    public SpConsignee selectByPrimaryKey(Integer cgnId) {
        return spConsigneeDAO.selectByPrimaryKey(cgnId);
    }

    
    public int updateByPrimaryKeySelective(SpConsignee record) {
        return spConsigneeDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpConsignee record) {
        return spConsigneeDAO.updateByPrimaryKey(record);
    }

}
