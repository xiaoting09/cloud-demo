package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.UUID;

/**
 * 服务提供者
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaProviderApplication {

	public static void main(String[] args) {
		log.info("--------------eureka 服务提供者启动-------------");
		SpringApplication.run(CloudEurekaProviderApplication.class, args);
	}
}
