package com.example.data.controller;

//import com.example.data.domain.rawStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lyra
 * @Date 2022 11 19 17 17
 **/
@RestController
public class stockController {

    @Autowired
    private com.example.data.mapper.rawStockMapper rawStockMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 获取单只股票信息
     * @return
     */
//    @RequestMapping("/getData")
//    public List<rawStock> getData(){
//        List<rawStock> rawDataList = rawStockMapper.getRawDataList();
//        return rawDataList;
//    }

    /**
     * 获取用户选股列表
     */


}
