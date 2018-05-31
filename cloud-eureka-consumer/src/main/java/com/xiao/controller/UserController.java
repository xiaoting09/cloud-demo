package com.xiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试请求
 *
 * @author 肖亭
 * @since 2018年05月29 15:40
 **/
@RestController
@RequestMapping(value = "/demo")
public class UserController {

    public static final String URL = "http://erekaProvider/api/user/{id}";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "{id}")
    public String get(@PathVariable(value = "id") Integer id){
        return restTemplate.getForObject(URL,String.class,id);
    }

}
