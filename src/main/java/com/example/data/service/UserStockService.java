package com.example.data.service;

import com.example.data.domain.StockConnector;
import com.example.data.domain.rawStock;
import com.example.data.domain.userStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
* @Author lyra
* @Date 2022/11/24 12:34
**/
@Service
public class UserStockService {
    @Autowired
    private com.example.data.mapper.UserStockMapper userStockMapper;

    /**
     * 获取用户自选股列表(ID)
     */
    public List<rawStock> getUserStocksById(Integer id){
        return userStockMapper.getUserStocksById(id);
    }

    /**
     * 获取用户单个自选股详情
     */
    public List<userStock> getSingleStockDetail(String tableName){
        //1.执行python获取最新数据

        //2.将数据从数据库提取
        return userStockMapper.selectSingleStockData(tableName);
        //3.返回到controller层
    }

    /**
     * 增加自选股票
     */
    public boolean addStock(Integer uid,Integer sid){
        StockConnector stockConnector = new StockConnector(uid,sid);
        //判断是否有该数据,有则不添加,无则添加
        if (userStockMapper.getStockInfo(stockConnector)!=null){
            return false;
        }else {
            return userStockMapper.addStockByStockId(stockConnector);
        }

    }

    /**
     * 删除用户选择的股票(ID)
     */
    public boolean delStock(Integer uid,Integer sid){
        StockConnector stockConnector = new StockConnector(uid,sid);
        if (userStockMapper.getStockInfo(stockConnector)!=null){
            return userStockMapper.delStock(stockConnector);
        }else {
            return false;
        }
    }

    /**
     * 获取某个股票的购买信号
     */
    public boolean getBuySignal(){
        //根据gold_death_cha判断

        return true;
    }

    /**
     * 回测(历史数据),返回收益和买入和卖出的时间
     */
    public void backTest(){

    }
}
