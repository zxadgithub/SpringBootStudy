package com.springboot.start.controller;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 9:25 2018/4/3
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public Object helllo(){
        return  "hello springboot!";
    }
}
