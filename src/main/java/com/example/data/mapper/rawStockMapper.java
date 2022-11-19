package com.example.data.mapper;


import com.example.data.domain.rawStock;
import com.example.data.domain.testData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author lyra
 * @Date 2022 11 19 10 31
 **/
@Component
@Mapper
public interface rawStockMapper {
    @Select("select * from rawdata")
    public List<rawStock> getRawDataList();

    @Select("SELECT * FROM st1 WHERE `index` = #{index}")
    public testData getTestData(Integer index);

//    @Select("SELECT date,`name`,`code`,`open`,high,low,`close`,MA_5,MA_10,gold,gold_death_cha FROM rawdata ")
//    public List<rawStock> getDataList();
}
