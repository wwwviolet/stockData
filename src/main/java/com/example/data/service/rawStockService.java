package com.example.data.service;

import com.example.data.domain.rawStock;
import com.example.data.mapper.rawStockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Author lyra
* @Date 2022/11/24 12:35
**/
@Service
public class rawStockService {
    @Autowired
    private rawStockMapper rawStockMapper;

    /**
     * 所有股票信息不分页
     */
    public List<rawStock> getAllStockDate(){
        //1.执行python脚本,并从数据库获取信息
        return rawStockMapper.getAllStockData();
    }

    /**
     * 所有股票信息分页查询
     */
    public List<rawStock> getAllStockDateByPage(Integer pageNo){
        pageNo = pageNo -1;
        //1.执行python脚本,并从数据库获取信息
        return rawStockMapper.getAllStockDateByPage(pageNo);
    }



}
