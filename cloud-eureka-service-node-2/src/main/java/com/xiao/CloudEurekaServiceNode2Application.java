package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * eureka注册服务节点2
 *
 * @author 肖亭
 * @since 2018年05月29 13:42
 **/
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServiceNode2Application {

    public static void main(String[] args) {
        log.info("---------------node two start------------------");
        SpringApplication.run(CloudEurekaServiceNode2Application.class);
        log.info("---------------node two end -------------------");

    }
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
        }
    }
}
