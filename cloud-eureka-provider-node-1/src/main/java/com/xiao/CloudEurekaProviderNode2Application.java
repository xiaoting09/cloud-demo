package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * 服务提供者节点2
 *
 * @author 肖亭
 * @since 2018年05月29 14:33
 **/
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaProviderNode2Application {

    public static void main(String[] args) {
        log.info("-----------------provider two start-------------");
        SpringApplication.run(CloudEurekaProviderNode2Application.class);
        log.info("-------------=---provider two end --------------");
    }

}
