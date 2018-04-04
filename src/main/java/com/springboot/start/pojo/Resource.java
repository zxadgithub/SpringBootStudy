package com.springboot.start.pojo;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 9:37 2018/4/4
*/

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.imooc.opensource")
@PropertySource(value = "classpath:resource.properties")
public class Resource {
    private String name;
    private String website;
    private String language;

}
