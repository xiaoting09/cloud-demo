package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 节点3
 *
 * @author 肖亭
 * @since 2018年05月29 14:36
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaProviderNode3Application {
    public static void main(String[] args) {
        log.info("-------------------provider Node3 start------------------");
        SpringApplication.run(CloudEurekaProviderNode3Application.class);
        log.info("-------------------provider Node3 end------------------");
    }
}
