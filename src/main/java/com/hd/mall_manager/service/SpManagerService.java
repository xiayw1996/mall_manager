package com.hd.mall_manager.service;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.dao.SpManagerDAO;
import com.hd.mall_manager.entity.SpManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class SpManagerService{

    @Resource
    private SpManagerDAO spManagerDAO;

    
    public int deleteByPrimaryKey(Integer mgId) {
        return spManagerDAO.deleteByPrimaryKey(mgId);
    }

    
    public int insert(SpManager record) {
        return spManagerDAO.insert(record);
    }

    
    public int insertSelective(SpManager record) {
        return spManagerDAO.insertSelective(record);
    }

    
    public SpManager selectByPrimaryKey(Integer mgId) {
        return spManagerDAO.selectByPrimaryKey(mgId);
    }

    
    public int updateByPrimaryKeySelective(SpManager record) {
        return spManagerDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpManager record) {
        return spManagerDAO.updateByPrimaryKey(record);
    }


    public SpManager queryByUserNameAndPwd(String username, String password) {
        return spManagerDAO.queryByUserNameAndPwd(username, password);
    }


    public PageData selectToPage(PageData pageData, String query){
        pageData.setRecordsTotal(spManagerDAO.selectToPageTotal(query));
        pageData.setPageData(spManagerDAO.selectToPageList(pageData, query));
        return pageData;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000,
            rollbackFor = Exception.class)
    public ResultVO insertOrUpdate(SpManager record, Integer inOrUpType) {
        if (inOrUpType == 1) {
            record.setMgTime((int) (new Date().getTime() / 1000));
            record.setRoleId((byte) 30);
            spManagerDAO.insert(record);
        } else {
            spManagerDAO.updateByPrimaryKeySelective(record);
        }
        Integer recordCount = spManagerDAO.checkUserName(record.getMgName());
        if (recordCount > 1) {
            throw ResultCode.accountDuplicateException.getDE();
        }
        return new ResultVO();
    }

}
