package com.xiao.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign配置
 * NONE，无日志记录（DEFAULT）。
 * BASIC，只记录请求方法和URL以及响应状态码和执行时间。
 * HEADERS，记录基本信息以及请求和响应头。
 * FULL，为请求和响应记录标题，正文和元数据。
 * @author 肖亭
 * @since 2018年05月30 11:07
 **/
@Configuration
public class FooConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }

}
