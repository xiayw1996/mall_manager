package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpReport3DAO;
import com.hd.mall_manager.entity.SpReport3;
@Service
public class SpReport3Service{

    @Resource
    private SpReport3DAO spReport3DAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spReport3DAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpReport3 record) {
        return spReport3DAO.insert(record);
    }

    
    public int insertSelective(SpReport3 record) {
        return spReport3DAO.insertSelective(record);
    }

    
    public SpReport3 selectByPrimaryKey(Integer id) {
        return spReport3DAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpReport3 record) {
        return spReport3DAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpReport3 record) {
        return spReport3DAO.updateByPrimaryKey(record);
    }

}
