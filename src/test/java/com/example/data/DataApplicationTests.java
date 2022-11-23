package com.example.data;


//import com.example.data.domain.rawStock;
import com.example.data.domain.rawStock;
import com.example.data.domain.userStock;
import com.example.data.mapper.rawStockMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import java.util.List;

@SpringBootTest
class DataApplicationTests {

    @Autowired
    private com.example.data.mapper.rawStockMapper rawStockMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private com.example.data.mapper.UserStockMapper sinaStockMapper;


//    @Test
//    void contextLoads() {
//        //1买入 -1卖出
//        List<rawStock> rawDataList = rawStockMapper.getRawDataList();
//        System.out.println(rawDataList);
//
//
//
////        List<userStock> sinaDataList = rawStockMapper.getSinaDataList();
////        System.out.println(sinaDataList);
//
//
//    }

    @Test
    void test(){
        List<userStock> sinaStocks = sinaStockMapper.selectSinaStockData("st");
        System.out.println(sinaStocks);
    }

    @Test
    void test1(){
        List<rawStock> testRawData = rawStockMapper.getTestRawData();
        System.out.println(testRawData);
    }

}
