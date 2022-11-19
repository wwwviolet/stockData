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

}
