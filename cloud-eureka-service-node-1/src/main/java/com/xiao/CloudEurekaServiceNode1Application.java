package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 集群节点1
 *
 * @author 肖亭
 * @since 2018年05月29 13:38
 **/
@Slf4j
@EnableHystrixDashboard
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServiceNode1Application {

    public static void main(String[] args) {
        log.info("-------------node one start-----------------");
        SpringApplication.run(CloudEurekaServiceNode1Application.class);
        log.info("-------------node one end-----------------");
    }
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
        }
    }
}
