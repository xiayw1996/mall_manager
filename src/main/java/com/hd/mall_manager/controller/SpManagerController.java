package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.PageData;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.entity.SpManager;
import com.hd.mall_manager.service.SpManagerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sm")
public class SpManagerController {

    @Resource
    private SpManagerService spManagerService;

    @RequestMapping("/users")
    public PageData users(PageData pageData,String query){
        return spManagerService.selectToPage(pageData,query);
    }

    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody SpManager record){
        return spManagerService.insertOrUpdate(record,1);
    }

    @RequestMapping("/update")
    public ResultVO update(@RequestBody SpManager record){
        if (record.getMgId() == 500) {
            return new ResultVO(ResultCode.adminOperationException);
        }
        return spManagerService.insertOrUpdate(record,2);
    }

    @RequestMapping("/delete")
    public ResultVO insert(Integer mgId){
        if (mgId == 500) {
            return new ResultVO(ResultCode.adminOperationException);
        }
        return new ResultVO(spManagerService.deleteByPrimaryKey(mgId));
    }

}
