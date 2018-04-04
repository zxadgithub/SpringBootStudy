package com.springboot.start.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 8:57 2018/4/4
*/
@ControllerAdvice
public class AllException {

    public final static String IMOOC_START_ERROR = "error";

    @ExceptionHandler(value = Exception.class)
    public Object errorHandle(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{

        e.printStackTrace();
        ModelAndView view = new ModelAndView();
        view.addObject(e);
        view.addObject("url",request.getRequestURI());
        view.setViewName(IMOOC_START_ERROR);
        return  view;
    }


}
