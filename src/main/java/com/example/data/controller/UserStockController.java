package com.example.data.controller;

//import com.example.data.domain.rawStock;
import com.example.data.domain.rawStock;
import com.example.data.domain.userStock;
import com.example.data.service.UserStockService;
import com.example.data.service.rawStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
* @Author lyra
* @Date 2022/11/24 12:35
**/
@RestController
public class UserStockController {

    @Autowired
    private com.example.data.service.rawStockService rawStockService;

    @Autowired
    private UserStockService userStockService;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 获取用户选股列表
     */
    @RequestMapping(value = "/stock/getAllUserStock/{id}",method = RequestMethod.GET)
    public List<rawStock> getAllUserStock(@PathVariable("id") Integer id){
        return userStockService.getUserStocksById(id);
    }

    /**
     * 获取用户单个自选股详情
     */
    @RequestMapping(value = "/stock/getSingleStockDetail/{tableName}",method = RequestMethod.GET)
    public List<userStock> getSingleStockDetail(@PathVariable("tableName") String tableName){
        return userStockService.getSingleStockDetail(tableName);
    }

    /**
     * 添加股票
     */
    @RequestMapping(value = "/stock/addStock/{uid}/{sid}",method = RequestMethod.GET)
    public Boolean addStock(@PathVariable("uid") Integer uid,@PathVariable("sid") Integer sid){
        return userStockService.addStock(uid,sid);
    }

    /**
     * 删除股票
     */
    @RequestMapping(value = "/stock/delStock/{uid}/{sid}",method = RequestMethod.GET)
    public Boolean delStock(@PathVariable("uid") Integer uid,@PathVariable("sid") Integer sid){
        return userStockService.delStock(uid,sid);
    }





}
