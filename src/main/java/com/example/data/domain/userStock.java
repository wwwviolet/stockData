package com.example.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Author lyra
 * @Date 2022 11 22 16 23
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//用户自选股
public class userStock {
    private Date day;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Integer volume;
    private Double MA5;
    private Double MA10;
    private Integer gold;
    private Double goldDeathCha;
    private String name;

}
