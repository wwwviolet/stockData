package com.example.data.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author lyra
 * @Date 2022 11 19 10 13
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class rawStock implements Serializable {
    private Date date;
    private String name;
    private String code;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Integer volume;
    private Double turnover;
    private Double turnoverRate;
    private Double MA5;
    private Double MA10;
    private Integer gold;
    private Double goldDeathCha;


//    public rawStock() {
//    }
//    /**
//     *
//     * @param date 日期
//     * @param name 股票名称
//     * @param code 股票代码
//     * @param open 开盘价
//     * @param high 最高价
//     * @param low 最低价
//     * @param close 闭盘价
//     * @param volume 容量
//     * @param turnover 转手量
//     * @param turnover_rate 转手率
//     * @param MA_5 五日均线
//     * @param MA_10 十日均线
//     * @param gold 金叉
//     * @param gold_death_cha 金叉和死叉(购入点和卖出点)
//     */
//    public rawStock(Date date, String name, String code, double open, double high, double low, double close, Integer volume, double turnover, double turnover_rate, double MA_5, double MA_10, Integer gold, double gold_death_cha) {
//        this.date = date;
//        this.name = name;
//        this.code = code;
//        this.open = open;
//        this.high = high;
//        this.low = low;
//        this.close = close;
//        this.volume = volume;
//        this.turnover = turnover;
//        this.turnover_rate = turnover_rate;
//        this.MA_5 = MA_5;
//        this.MA_10 = MA_10;
//        this.gold = gold;
//        this.gold_death_cha = gold_death_cha;
//    }

    @Override
    public String toString() {
        return "rawStock{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", MA_5=" + MA5 +
                ", MA_10=" + MA10 +
                ", gold=" + gold +
                ", gold_death_cha=" + goldDeathCha +
                '}';
    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public double getOpen() {
//        return open;
//    }
//
//    public void setOpen(double open) {
//        this.open = open;
//    }
//
//    public double getHigh() {
//        return high;
//    }
//
//    public void setHigh(double high) {
//        this.high = high;
//    }
//
//    public double getLow() {
//        return low;
//    }
//
//    public void setLow(double low) {
//        this.low = low;
//    }
//
//    public double getClose() {
//        return close;
//    }
//
//    public void setClose(double close) {
//        this.close = close;
//    }
//
//    public Integer getVolume() {
//        return volume;
//    }
//
//    public void setVolume(Integer volume) {
//        this.volume = volume;
//    }
//
//    public double getTurnover() {
//        return turnover;
//    }
//
//    public void setTurnover(double turnover) {
//        this.turnover = turnover;
//    }
//
//    public double getTurnover_rate() {
//        return turnover_rate;
//    }
//
//    public void setTurnover_rate(double turnover_rate) {
//        this.turnover_rate = turnover_rate;
//    }
//
//    public double getMA_5() {
//        return MA_5;
//    }
//
//    public void setMA_5(double MA_5) {
//        this.MA_5 = MA_5;
//    }
//
//    public double getMA_10() {
//        return MA_10;
//    }
//
//    public void setMA_10(double MA_10) {
//        this.MA_10 = MA_10;
//    }
//
//    public Integer getGold() {
//        return gold;
//    }
//
//    public void setGold(Integer gold) {
//        this.gold = gold;
//    }
//
//    public double getGold_death_cha() {
//        return gold_death_cha;
//    }
//
//    public void setGold_death_cha(double gold_death_cha) {
//        this.gold_death_cha = gold_death_cha;
//    }
}
