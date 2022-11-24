package com.example.data.mapper;

import com.example.data.domain.StockConnector;
import com.example.data.domain.rawStock;
import com.example.data.domain.userStock;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Author lyra
* @Date 2022/11/24 12:35
**/
@Component
@Mapper
public interface UserStockMapper {
    /**
     * 获取用户自选股列表(ID)
     */
    @Select("SELECT DISTINCT num,`code`,`name`,`newPrice`,`rAf`,`iAd`,`volume`,`turnover`,`amplitude`,high,low,`open`,`PRE`,`volume_ratio`,`turnover_rate`,`pe_ratio`,`pb_ratio` FROM astest1,stocks WHERE stocks.sid = astest1.`code` AND stocks.uid = #{id}")
    List<rawStock> getUserStocksById(Integer id);

    /**
     * 获取用户自选股单支股票的详细信息
     */
    @Select("SELECT `name`,`code`,`day`,`open`,`high`,`low`,`close`,`volume`,MA_5,MA_10,`gold`,`gold_death_cha` FROM ${tableName}")
    List<userStock> selectSingleStockData(String tableName);

    /**
     * 增加股票(与用户ID关联)
     */
    @Insert("INSERT INTO stocks(id,uid,sid) VALUES(NULL,#{uid},#{sid})")
    Boolean addStockByStockId(StockConnector StockConnector);

    /**
     * 删除股票(与用户ID关联)
     */
    @Delete("DELETE FROM stocks WHERE uid=#{uid} AND sid=#{sid}")
    Boolean delStock(StockConnector stockConnector);

    /**
     * 查询股票关联信息
     */
    @Select("SELECT `uid`,`sid` FROM stocks WHERE uid=#{uid} AND sid=#{sid}")
    StockConnector getStockInfo(StockConnector stockConnector);



}
