package com.hd.mall_manager.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpGoodsCatsDAO;
import com.hd.mall_manager.entity.SpGoodsCats;

import java.util.List;

@Service
public class SpGoodsCatsService{

    @Resource
    private SpGoodsCatsDAO spGoodsCatsDAO;

    
    public int deleteByPrimaryKey(Integer catId) {
        return spGoodsCatsDAO.deleteByPrimaryKey(catId);
    }

    
    public int insert(SpGoodsCats record) {
        return spGoodsCatsDAO.insert(record);
    }

    
    public int insertSelective(SpGoodsCats record) {
        return spGoodsCatsDAO.insertSelective(record);
    }

    
    public SpGoodsCats selectByPrimaryKey(Integer catId) {
        return spGoodsCatsDAO.selectByPrimaryKey(catId);
    }

    
    public int updateByPrimaryKeySelective(SpGoodsCats record) {
        return spGoodsCatsDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpGoodsCats record) {
        return spGoodsCatsDAO.updateByPrimaryKey(record);
    }


    /**
     * 查询所有记录
     * @return
     */
    public List<SpGoodsCats> selectAll(){
        return spGoodsCatsDAO.selectAll();
    }

}
