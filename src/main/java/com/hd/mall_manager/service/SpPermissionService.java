package com.hd.mall_manager.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpPermission;
import com.hd.mall_manager.dao.SpPermissionDAO;

import java.util.List;

@Service
public class SpPermissionService{

    @Resource
    private SpPermissionDAO spPermissionDAO;

    
    public int deleteByPrimaryKey(Short psId) {
        return spPermissionDAO.deleteByPrimaryKey(psId);
    }

    
    public int insert(SpPermission record) {
        return spPermissionDAO.insert(record);
    }

    
    public int insertSelective(SpPermission record) {
        return spPermissionDAO.insertSelective(record);
    }

    
    public SpPermission selectByPrimaryKey(Short psId) {
        return spPermissionDAO.selectByPrimaryKey(psId);
    }

    
    public int updateByPrimaryKeySelective(SpPermission record) {
        return spPermissionDAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpPermission record) {
        return spPermissionDAO.updateByPrimaryKey(record);
    }


    public Object selectAll(Integer type){
        //如果type == 0就是普通列表，否责就是树形结构
        if(type == 0){
            return spPermissionDAO.selectAll();
        } else {
            JSONArray ja = new JSONArray();
            List<SpPermission> spList = spPermissionDAO.selectRightAll((short) 0,"0");
            for(SpPermission sp : spList){
                JSONArray ja1 = new JSONArray();
                List<SpPermission> spList1 = spPermissionDAO.selectRightAll(sp.getPsId(),"1");
                for(SpPermission sp1 : spList1){
                    JSONArray ja2 = new JSONArray();
                    List<SpPermission> spList2 = spPermissionDAO.selectRightAll(sp1.getPsId(),"2");
                    for(SpPermission sp2 : spList2){
                        JSONObject jo3 = new JSONObject();
                        jo3.put("id",sp2.getPsId());
                        jo3.put("authName",sp2.getPsName());
                        jo3.put("path",null);
                        jo3.put("pid",sp2.getPsPid());
                        ja2.add(jo3);
                    }

                    JSONObject jo2 = new JSONObject();
                    jo2.put("id",sp1.getPsId());
                    jo2.put("authName",sp1.getPsName());
                    jo2.put("path",null);
                    jo2.put("pid",sp1.getPsPid());
                    jo2.put("children",ja2);
                    ja1.add(jo2);
                }

                JSONObject jo1 = new JSONObject();
                jo1.put("id",sp.getPsId());
                jo1.put("authName",sp.getPsName());
                jo1.put("path",null);
                jo1.put("pid",sp.getPsPid());
                jo1.put("children",ja1);
                ja.add(jo1);
            }
            return ja;
        }
    }

}
