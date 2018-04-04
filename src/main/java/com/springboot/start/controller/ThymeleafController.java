package com.springboot.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 11:26 2018/4/4
*/
@Controller
@RequestMapping("tl")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","Hello 张新安");
        return "thymeleaf/index";
    }

}
