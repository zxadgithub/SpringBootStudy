package com.springboot.start.controller;

import com.springboot.start.pojo.IMoocJSONResult;
import com.springboot.start.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 9:41 2018/4/4
*/
@Controller
@RequestMapping("fm")
public class FreeMakerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource",resource);

        return "freemaker/index";

    }

    @RequestMapping("/center")
    public String center(){
        return "freemaker/center/center";
    }
}
