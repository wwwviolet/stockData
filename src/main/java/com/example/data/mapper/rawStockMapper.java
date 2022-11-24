package com.example.data.mapper;


//import com.example.data.domain.rawStock;
import com.example.data.domain.rawStock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Author lyra
* @Date 2022/11/24 12:34
**/
@Component
@Mapper
public interface rawStockMapper {
    /**
     * 所有自选股列表(沪深京 A 股)
     */
    @Select("SELECT num,`code`,`name`,`newPrice`,`rAf`,`iAd`,`volume`,`turnover`,`amplitude`,high,low,`open`,`PRE`,`volume_ratio`,`turnover_rate`,`pe_ratio`,`pb_ratio` FROM astest1")
    public List<rawStock> getAllStockData();

    /**
     * 自选股列表分页(沪深京 A 股)
     */
    @Select("SELECT num,`code`,`name`,`newPrice`,`rAf`,`iAd`,`volume`,`turnover`,`amplitude`,high,low,`open`,`PRE`,`volume_ratio`,`turnover_rate`,`pe_ratio`,`pb_ratio` FROM astest1 LIMIT #{pageBegin},40")
    public List<rawStock> getAllStockDateByPage(@Param("pageBegin") Integer pageBegin);

}
