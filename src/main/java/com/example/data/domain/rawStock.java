package com.example.data.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
* @Author lyra
* @Date 2022/11/24 21:02
**/


//沪深京 A 股的信息,在主界面展示,用于用户选股
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class rawStock implements Serializable {
    /**
     *
     * @param num           序号
     * @param code          股票代码
     * @param name          股票名称
     * @param newPrice      最新价
     * @param rAf           涨跌幅
     * @param iAd           涨跌额
     * @param volume        成交量
     * @param turnover      成交额
     * @param amplitude     振幅
     * @param high          最高
     * @param low           最低
     * @param open          今开
     * @param PRE           昨收
     * @param volumeRatio   量比
     * @param turnoverRate  换手率
     */
    private Integer num;
    private String code;
    private String name;
    private Double newPrice;
    private Double rAf;
    private Double iAd;
    private Integer volume;
    private Double turnover;
    private Double amplitude;
    private Double high;
    private Double low;
    private Double open;
    private Double PRE;
    private Double volumeRatio;
    private Double turnoverRate;
    private Double peRatio;
    private Double pbRatio;


}
