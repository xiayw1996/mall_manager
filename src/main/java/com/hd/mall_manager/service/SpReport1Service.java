package com.hd.mall_manager.service;

import com.alibaba.fastjson.JSONObject;
import com.hd.mall_manager.bean.ResultVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpReport1;
import com.hd.mall_manager.dao.SpReport1DAO;

import java.util.List;

@Service
public class SpReport1Service{

    @Resource
    private SpReport1DAO spReport1DAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spReport1DAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpReport1 record) {
        return spReport1DAO.insert(record);
    }

    
    public int insertSelective(SpReport1 record) {
        return spReport1DAO.insertSelective(record);
    }

    
    public SpReport1 selectByPrimaryKey(Integer id) {
        return spReport1DAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpReport1 record) {
        return spReport1DAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpReport1 record) {
        return spReport1DAO.updateByPrimaryKey(record);
    }


    public ResultVO select(String startDate, String endDate) {
        //获取列表数据
        List<SpReport1> spReport1List = spReport1DAO.select(startDate, endDate);
        //封装返回结果
        JSONObject jo = new JSONObject();
        //封装成两个数组，一个是名称，一个是数据值
        String[] xAxis = new String[spReport1List.size()];
        Integer[] series = new Integer[spReport1List.size()];
        //循环添加赋值
        for (int i = 0; i< spReport1List.size(); i++) {
            xAxis[i] = spReport1List.get(i).getRp1Area();
            series[i] = spReport1List.get(i).getRp1UserCount();
        }
        //将结果放入json中
        jo.put("xAxis", xAxis);
        jo.put("series", series);
        return new ResultVO(jo);
    }

}
