package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpPermissionApi;
import com.hd.mall_manager.dao.SpPermissionApiDAO;
@Service
public class SpPermissionApiService{

    @Resource
    private SpPermissionApiDAO spPermissionApiDAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spPermissionApiDAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpPermissionApi record) {
        return spPermissionApiDAO.insert(record);
    }

    
    public int insertSelective(SpPermissionApi record) {
        return spPermissionApiDAO.insertSelective(record);
    }

    
    public SpPermissionApi selectByPrimaryKey(Integer id) {
        return spPermissionApiDAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpPermissionApi record) {
        return spPermissionApiDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpPermissionApi record) {
        return spPermissionApiDAO.updateByPrimaryKey(record);
    }

}
