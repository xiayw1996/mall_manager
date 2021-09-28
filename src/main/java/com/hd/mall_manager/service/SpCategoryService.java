package com.hd.mall_manager.service;

import com.hd.mall_manager.bean.PageData;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpCategoryDAO;
import com.hd.mall_manager.entity.SpCategory;

import java.util.List;

@Service
public class SpCategoryService{

    @Resource
    private SpCategoryDAO spCategoryDAO;

    
    public int deleteByPrimaryKey(Integer catId) {
        return spCategoryDAO.deleteByPrimaryKey(catId);
    }

    
    public int insert(SpCategory record) {
        return spCategoryDAO.insert(record);
    }

    
    public int insertSelective(SpCategory record) {
        return spCategoryDAO.insertSelective(record);
    }

    
    public SpCategory selectByPrimaryKey(Integer catId) {
        return spCategoryDAO.selectByPrimaryKey(catId);
    }

    
    public int updateByPrimaryKeySelective(SpCategory record) {
        return spCategoryDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpCategory record) {
        return spCategoryDAO.updateByPrimaryKey(record);
    }


    /**
     * 查询所有记录
     * @return
     */
    public List<SpCategory> selectAll(){
        return spCategoryDAO.selectAll();
    }

    /**
     * 分页查询
     * @param pageData  分页组件
     * @param query     查询条件
     * @return
     */
    public PageData selectToPage(PageData pageData, String query) {
        pageData.setRecordsTotal(spCategoryDAO.selectToPageTotal(query));
        pageData.setPageData(spCategoryDAO.selectToPageList(pageData, query));
        return pageData;
    }

}
