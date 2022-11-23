package com.example.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author lyra
 * @Date 2022 11 22 20 05
 **/

//test
@Controller
public class pageController {

    @GetMapping("/axios")
    public String test(){
        return "axios";
    }

}
