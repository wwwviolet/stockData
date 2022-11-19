package com.example.data;


import com.example.data.domain.rawStock;
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

    @Test
    void contextLoads() {
        //1买入 -1卖出
        List<rawStock> rawDataList = rawStockMapper.getRawDataList();
        System.out.println(rawDataList);

    }

}
