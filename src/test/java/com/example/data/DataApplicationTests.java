package com.example.data;


import com.example.data.domain.StockConnector;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class DataApplicationTests {

    @Autowired
    private com.example.data.mapper.rawStockMapper rawStockMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private com.example.data.mapper.UserStockMapper userStockMapper;


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


//        List<rawStock> allStockDateByPage = rawStockMapper.getAllStockDateByPage(0);
//        System.out.println(allStockDateByPage);
//        List<userStock> rawdata3 = userStockMapper.selectSingleStockData("rawdata3");
//        System.out.println(rawdata3);

        StockConnector StockConnector = new StockConnector(0,301168);
//        delStock delStock = new delStock(0,688226);
//        userStockMapper.addStockByStockId(StockConnector);
//        userStockMapper.addStockByStockId(StockConnector);

//        System.out.println(userStockMapper.getUserStocksById(0));
//        userStockMapper.delStock(StockConnector);

        StockConnector stockInfo = userStockMapper.getStockInfo(StockConnector);
        System.out.println(stockInfo);
    }

}
