package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpGoodsPicsDAO;
import com.hd.mall_manager.entity.SpGoodsPics;
@Service
public class SpGoodsPicsService{

    @Resource
    private SpGoodsPicsDAO spGoodsPicsDAO;

    
    public int deleteByPrimaryKey(Integer picsId) {
        return spGoodsPicsDAO.deleteByPrimaryKey(picsId);
    }

    
    public int insert(SpGoodsPics record) {
        return spGoodsPicsDAO.insert(record);
    }

    
    public int insertSelective(SpGoodsPics record) {
        return spGoodsPicsDAO.insertSelective(record);
    }

    
    public SpGoodsPics selectByPrimaryKey(Integer picsId) {
        return spGoodsPicsDAO.selectByPrimaryKey(picsId);
    }

    
    public int updateByPrimaryKeySelective(SpGoodsPics record) {
        return spGoodsPicsDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpGoodsPics record) {
        return spGoodsPicsDAO.updateByPrimaryKey(record);
    }

}
