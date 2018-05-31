package com.xiao;

import com.xiao.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * zuul网关服务
 *
 * @author 肖亭
 * @since 2018年05月30 21:08
 **/
@EnableZuulProxy
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class);
    }
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
