package com.hd.mall_manager.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.dao.SpManagerDAO;
import com.hd.mall_manager.dao.SpPermissionDAO;
import com.hd.mall_manager.entity.SpManager;
import com.hd.mall_manager.entity.SpPermission;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpRole;
import com.hd.mall_manager.dao.SpRoleDAO;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpRoleService{

    @Resource
    private SpRoleDAO spRoleDAO;

    @Resource
    private SpPermissionDAO spPermissionDAO;

    @Resource
    private SpManagerDAO spManagerDAO;

    
    public int deleteByPrimaryKey(Short roleId) {
        return spRoleDAO.deleteByPrimaryKey(roleId);
    }

    
    public int insert(SpRole record) {
        return spRoleDAO.insert(record);
    }

    
    public int insertSelective(SpRole record) {
        return spRoleDAO.insertSelective(record);
    }

    
    public SpRole selectByPrimaryKey(Short roleId) {
        return spRoleDAO.selectByPrimaryKey(roleId);
    }

    
    public int updateByPrimaryKeySelective(SpRole record) {
        return spRoleDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpRole record) {
        return spRoleDAO.updateByPrimaryKey(record);
    }


    public Object selectAll(){
        return spRoleDAO.selectAll();
    }

    public Object selectRoleRight(){
        JSONArray ja = new JSONArray();
        //先取出所有的角色
        List<SpRole> srList = spRoleDAO.selectAll();
        //然后循环
        for (SpRole sr : srList){
            Short roleId = sr.getRoleId();
            //JSONArray ja1 = childrenList(roleId);
            JSONArray ja1 = childrenList1(roleId,(short)0,"0");

            JSONObject jo1 = new JSONObject();
            jo1.put("id",roleId);
            jo1.put("roleName",sr.getRoleName());
            jo1.put("roleDesc",sr.getRoleDesc());
            jo1.put("children",ja1);
            ja.add(jo1);
        }
        return ja;
    }

    /*
    public JSONArray childrenList(Short roleId){
        JSONArray ja1 = new JSONArray();
        List<SpPermission> spList1 = spPermissionDAO.selectRight(roleId,(short) 0,"0");
        for(SpPermission sp1 : spList1){
            JSONArray ja2 = new JSONArray();
            List<SpPermission> spList2 = spPermissionDAO.selectRight(roleId,sp1.getPsId(),"1");
            for (SpPermission sp2 : spList2) {
                JSONArray ja3 = new JSONArray();
                List<SpPermission> spList3 = spPermissionDAO.selectRight(roleId,sp2.getPsId(),"2");
                for(SpPermission sp3 : spList3){
                    JSONObject jo4 = new JSONObject();
                    jo4.put("id",sp3.getPsId());
                    jo4.put("authName",sp3.getPsName());
                    jo4.put("path",null);
                    ja3.add(jo4);
                }

                JSONObject jo3 = new JSONObject();
                jo3.put("id",sp2.getPsId());
                jo3.put("authName",sp2.getPsName());
                jo3.put("path",null);
                jo3.put("children",ja3);
                ja2.add(jo3);
            }

            JSONObject jo2 = new JSONObject();
            jo2.put("id",sp1.getPsId());
            jo2.put("authName",sp1.getPsName());
            jo2.put("path",null);
            jo2.put("children",ja2);
            ja1.add(jo2);
        }
        return ja1;
    }
     */

    //另一种用递归的写法
    public JSONArray childrenList1(Short roleId,Short psId, String psLevel){
        JSONArray ja = new JSONArray();
        List<SpPermission> spList = spPermissionDAO.selectRight(roleId,psId,psLevel);
        for(SpPermission sp : spList) {
            JSONArray ja1 = childrenList1(roleId, sp.getPsId(), Integer.parseInt(psLevel)+1+"");
            JSONObject jo = new JSONObject();
            jo.put("id",sp.getPsId());
            jo.put("authName",sp.getPsName());
            jo.put("path",null);
            jo.put("children",ja1);
            ja.add(jo);
        }
        return ja;
    }

    public ResultVO deleteRoleRight(Short roleId,Short psId){
        List<Short> jList = new ArrayList<>();
        //先将自己添加到这个列表里
        jList.add(psId);
        //获取所有下级的列表
        jList = parentStr(psId,jList);
        //然后将这个列表匹配一下,让总列表中，不包含的拿出来
        jList = spPermissionDAO.selectNotSubList(roleId,jList);
        //去除空格和中括号
        String jStr = StringUtils.strip(jList.toString(),"[]").replaceAll(" ","");

        SpRole sr = spRoleDAO.selectByPrimaryKey(roleId);
        sr.setPsIds(jStr);
        spRoleDAO.updateByPrimaryKeySelective(sr);

        return new ResultVO(childrenList1(roleId,(short)0,"0"));
    }

    //循环拼接所有下级
    public List<Short> parentStr(Short psId,List<Short> jList) {
        //取出所有当前模块下的下级
        List<Short> subIdList = spPermissionDAO.subIdList(psId);
        //将下级的子集添加进去
        jList.addAll(subIdList);
        for(Short subId : subIdList){
            //循环递归拼接下级
            return parentStr(subId,jList);
        }
        return jList;
    }

    public int updateRoleRight(Short roleId,List<Short> psIds){
        SpRole sr = spRoleDAO.selectByPrimaryKey(roleId);
        String psidsStr = StringUtils.strip(psIds.toString(),"[]").replaceAll(" ","");
        sr.setPsIds(psidsStr);
        return spRoleDAO.updateByPrimaryKeySelective(sr);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public ResultVO insertOrUpdate(SpRole record, Integer inOrUpType) {
        //如果类型是1就插入,其他的就更新
        if (inOrUpType == 1) {
            spRoleDAO.insert(record);
        } else {
            spRoleDAO.updateByPrimaryKeySelective(record);
        }

        //校验用户名是否重复
        Integer count = spRoleDAO.countByName(record.getRoleName());
        if(count > 1){
            throw ResultCode.roleNameException.getDE();
        }
        return new ResultVO();
    }

    public ResultVO delete(Short roleId) {
        //先查询这个角色id是否被其他用户关联，如果已经被关联，就列出关联列表
        List<SpManager> spManagers = spManagerDAO.selectByRoleId(roleId);
        if (spManagers == null || spManagers.size() <= 0) {
            //如果没有被关联，就直接删除
            spRoleDAO.deleteByPrimaryKey(roleId);
            return new ResultVO();
        } else {
            //有关联的用户，就给出关联的用户名称列表
            String userNameList = "";
            for (SpManager sm : spManagers) {
                userNameList = userNameList + sm.getMgName() + ";";
            }
            return new ResultVO(309,"已绑定的用户列表：" + userNameList);
        }
    }

}
