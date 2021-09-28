package com.hd.mall_manager.controller;

import com.hd.mall_manager.bean.Constant;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.entity.SpRole;
import com.hd.mall_manager.service.SpRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sr")
public class SpRoleController {

    @Resource
    private SpRoleService spRoleService;

    @RequestMapping("/selectAll")
    public ResultVO selectAll(){
        return new ResultVO(spRoleService.selectAll());
    }

    @RequestMapping("/selectRoleRight")
    public ResultVO selectRoleRight(){
        return new ResultVO(spRoleService.selectRoleRight());
    }

    /**
     * 根据角色id 和 要删除的权限id ，删除这个角色的这个权限（包括该权限的子权限）
     * @param roleId
     * @param psId
     * @return
     */
    @RequestMapping("/deleteRoleRight")
    public ResultVO deleteRoleRight(Short roleId,Short psId){
        //如果当前id是30（管理员）角色
        if (Constant.roleId.equals(roleId)) {
            return new ResultVO(ResultCode.adminOperationRoleException);
        }
        return spRoleService.deleteRoleRight(roleId,psId);
    }

    /**
     * 根据角色id 和权限id列表，更新该角色的权限
     * @param roleId
     * @param psIds
     * @return
     */
    @RequestMapping("/updateRoleRight")
    public ResultVO updateRoleRight(Short roleId, @RequestParam(name = "psIds",required = false) List<Short> psIds){
        //如果当前id是30（管理员）角色
        if (Constant.roleId.equals(roleId)) {
            return new ResultVO(ResultCode.adminOperationRoleException);
        }
        return new ResultVO(spRoleService.updateRoleRight(roleId,psIds));
    }

    @RequestMapping("/insert")
    public ResultVO insert(@RequestBody SpRole record){
        if (record == null) {
            return new ResultVO(ResultCode.paramNullException);
        }
        return spRoleService.insertOrUpdate(record, 1);
    }

    @RequestMapping("/update")
    public ResultVO update(@RequestBody SpRole record){
        if (record == null) {
            return new ResultVO(ResultCode.paramNullException);
        }
        //如果当前id是30（管理员）角色
        if (Constant.roleId.equals(record.getRoleId())) {
            return new ResultVO(ResultCode.adminOperationRoleException);
        }
        return spRoleService.insertOrUpdate(record, 2);
    }

    @RequestMapping("/delete")
    public ResultVO delete(Short roleId){
        //如果当前id是30（管理员）角色
        if (Constant.roleId.equals(roleId)) {
            return new ResultVO(ResultCode.adminOperationRoleException);
        }
        return spRoleService.delete(roleId);
    }

}
