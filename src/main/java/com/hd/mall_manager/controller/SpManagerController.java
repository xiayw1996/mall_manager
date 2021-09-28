package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.Constant;
import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.entity.SpManager;
import com.hd.mall_manager.service.SpManagerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 管理员
 */
@RestController
@RequestMapping("/sm")
public class SpManagerController {

    @Resource
    private SpManagerService spManagerService;

    /**
     * 分页查询
     * @param pageData  分页组件
     * @param query     查询条件
     * @return
     */
    @RequestMapping("/users")
    public PageData users(PageData pageData,String query){
        return spManagerService.selectToPage(pageData,query);
    }

    /**
     * 插入
     * @param record    实体类
     * @return
     */
    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody SpManager record){
        return spManagerService.insertOrUpdate(record,1);
    }

    /**
     * 更新
     * @param record    实体类
     * @return
     */
    @RequestMapping("/update")
    public ResultVO update(@RequestBody SpManager record){
        //如果当前id是500（管理员）
        if (Constant.mgId.equals(record.getMgId())) {
            return new ResultVO(ResultCode.adminOperationException);
        }
        return spManagerService.insertOrUpdate(record,2);
    }

    /**
     * 根据id删除
     * @param mgId      主键id
     * @return
     */
    @RequestMapping("/delete")
    public ResultVO insert(Integer mgId){
        //如果当前id是500（管理员）
        if (Constant.mgId.equals(mgId)) {
            return new ResultVO(ResultCode.adminOperationException);
        }
        return new ResultVO(spManagerService.deleteByPrimaryKey(mgId));
    }

}
