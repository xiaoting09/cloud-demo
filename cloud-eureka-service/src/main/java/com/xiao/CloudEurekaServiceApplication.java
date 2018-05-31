package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * eureka注册服务
 *
 * @author 肖亭
 * @since 2018年05月25 13:57
 **/
@Slf4j
@EnableHystrixDashboard
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServiceApplication {
    public static void main(String[] args) {
        log.info("-----------------eureka 服务注册中心启动----------------");
        SpringApplication.run(CloudEurekaServiceApplication.class);
    }
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
        }
    }
}
