package com.example.data.mapper;


//import com.example.data.domain.rawStock;
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

    /**
     * 测试
     * @param index
     * @return
     */
    @Select("SELECT * FROM st1 WHERE `index` = #{index}")
    public testData getTestData(Integer index);

    /**
     * 所有自选股列表(沪深京 A 股)
     * @return
     */
    @Select("SELECT num,`code`,`name`,`newPrice`,`rAf`,`iAd`,`volume`,`turnover`,`amplitude`,high,low,`open`,`PRE`,`volume_ratio`,`turnover_rate`,`pe_ratio`,`pb_ratio` FROM astest1")
    public List<rawStock> getTestRawData();


}
