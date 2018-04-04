package com.springboot.start.pojo;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 10:07 2018/4/3
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data

public class User {

    private String name;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh" ,timezone = "GMT+8")
    private Date birthday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

}
