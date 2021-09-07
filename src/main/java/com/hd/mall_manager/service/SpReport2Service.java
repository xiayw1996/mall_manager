package com.hd.mall_manager.service;

import com.alibaba.fastjson.JSONObject;
import com.hd.mall_manager.bean.ResultVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hd.mall_manager.entity.SpReport2;
import com.hd.mall_manager.dao.SpReport2DAO;

import java.util.List;

@Service
public class SpReport2Service{

    @Resource
    private SpReport2DAO spReport2DAO;

    
    public int deleteByPrimaryKey(Integer id) {
        return spReport2DAO.deleteByPrimaryKey(id);
    }

    
    public int insert(SpReport2 record) {
        return spReport2DAO.insert(record);
    }

    
    public int insertSelective(SpReport2 record) {
        return spReport2DAO.insertSelective(record);
    }

    
    public SpReport2 selectByPrimaryKey(Integer id) {
        return spReport2DAO.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SpReport2 record) {
        return spReport2DAO.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SpReport2 record) {
        return spReport2DAO.updateByPrimaryKey(record);
    }


    public ResultVO select(String startDate, String endDate) {
        //获取列表数据
        List<SpReport2> spReport2List = spReport2DAO.select(startDate, endDate);
        //封装返回结果
        JSONObject jo = new JSONObject();
        //封装成两个数组，一个是名称，一个是数据值
        String[] xAxis = new String[spReport2List.size()];
        Integer[] series = new Integer[spReport2List.size()];
        //循环添加赋值
        for (int i = 0; i< spReport2List.size(); i++) {
            xAxis[i] = spReport2List.get(i).getRp2Page();
            series[i] = spReport2List.get(i).getRp2Count();
        }
        //将结果放入json中
        jo.put("xAxis", xAxis);
        jo.put("series", series);
        return new ResultVO(jo);
    }

}
