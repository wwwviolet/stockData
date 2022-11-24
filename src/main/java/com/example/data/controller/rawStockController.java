package com.example.data.controller;

import com.example.data.domain.rawStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @Author lyra
* @Date 2022/11/24 12:35
**/
@RestController
public class rawStockController {

    @Autowired
    private com.example.data.service.rawStockService rawStockService;

    /**
     * 所有股票信息不分页
     */
    @RequestMapping("/stock/getRawStock")
    public List<rawStock> getStockList(){
        return rawStockService.getAllStockDate();
    }


    /**
     * 所有股票信息分页查询
     * @param pageNo
     * @return
     */
    @RequestMapping(value = "/stock/getRawStock/{pageNo}",method = RequestMethod.GET)
    public List<rawStock> getAllStockDateByPage(@PathVariable("pageNo") Integer pageNo){
        return rawStockService.getAllStockDateByPage(pageNo);
    }

}
