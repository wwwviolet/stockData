package com.example.data.service;

import com.example.data.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
* @Author lyra
* @Date 2022/11/24 12:35
**/
@Service
public class userService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户登录
     */
    public boolean login(HttpSession session){
        //如果数据库有用户信息,则进行登录成功,并将session的传值
        return true;
    }

}
