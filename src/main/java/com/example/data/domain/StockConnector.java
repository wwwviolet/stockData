package com.example.data.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
* @Author lyra
* @Date 2022/11/24 21:02
**/
@Data
@NoArgsConstructor
public class StockConnector implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer uid;
    private Integer sid;

    public StockConnector(Integer uid, Integer sid) {
        this.uid = uid;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "StockConnector{" +
                "uid=" + uid +
                ", sid=" + sid +
                '}';
    }
}
