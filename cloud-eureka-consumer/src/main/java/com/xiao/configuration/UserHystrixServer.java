package com.xiao.configuration;

import com.xiao.feign.IUserServer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Hystrix示列
 *
 * @author 肖亭
 * @since 2018年05月30 20:18
 **/
@Component
public class UserHystrixServer implements IUserServer {
    @PostConstruct
    private void post(){
        System.out.println("UserHystrixServer.post");
    }
    @Override
    public String getProvider(Integer id) {
        return "测试熔断";
    }
}
