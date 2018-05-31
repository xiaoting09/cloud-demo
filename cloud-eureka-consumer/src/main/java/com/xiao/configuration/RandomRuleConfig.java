/*
package com.xiao.configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*/
/**
 * 随机算法
 *
 * @author 肖亭
 * @since 2018年05月29 21:22
 **//*

@Configuration
public class RandomRuleConfig {
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }

}
*/
