package com.springboot.start.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.springboot.start.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 10:13 2018/4/3
 */
@RestController
public class UserController {

    @RequestMapping("getUser")
    public Object getUser(){

        User user = new User();
        user.setName("zxa");
        user.setAge(18);
        user.setBirthday(new Date());

        user.setDesc("hello");

        return user;
    }

}
