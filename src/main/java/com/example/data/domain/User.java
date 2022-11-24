package com.example.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Author lyra
 * @Date 2022 11 23 13 34
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer id;
    private String uname;
    private String pwd;
    private List<userStock> userStocks; //1:n
}
