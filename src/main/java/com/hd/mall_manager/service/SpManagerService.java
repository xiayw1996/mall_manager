package com.hd.mall_manager.service;

import com.hd.mall_manager.bean.Constant;
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


    /**
     * 分页查询
     * @param pageData      分页组件
     * @param query         查询条件
     * @return
     */
    public PageData selectToPage(PageData pageData, String query){
        pageData.setRecordsTotal(spManagerDAO.selectToPageTotal(query));
        pageData.setPageData(spManagerDAO.selectToPageList(pageData, query));
        return pageData;
    }

    /**
     * 插入或删除
     * @param record        实体类
     * @param inOrUpType    插入或更新类型  1.插入  2.更新
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public ResultVO insertOrUpdate(SpManager record, Integer inOrUpType) {
        //插入
        if (inOrUpType == 1) {
            //设置时间戳
            record.setMgTime((int) (new Date().getTime() / 1000));
            //设置角色,默认30(管理员)
            record.setRoleId(Constant.roleId.byteValue());
            //插入记录
            spManagerDAO.insert(record);
        } else {
            //更新记录
            spManagerDAO.updateByPrimaryKeySelective(record);
        }
        //根据名称检测这个名称的总数
        Integer recordCount = spManagerDAO.checkUserName(record.getMgName());
        //如果总数大于1，那么说明有名称重复
        if (recordCount > 1) {
            //抛出异常，并回滚记录
            throw ResultCode.accountDuplicateException.getDE();
        }
        return new ResultVO();
    }

}
