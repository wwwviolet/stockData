package com.example.data.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author lyra
 * @Date 2022 11 23 13 34
 **/
@Component
@Mapper
public interface UserMapper {
    /**
     * 登录
     */
    void login();

    /**
     * 修改信息
     */
    void updateInfo();







}
