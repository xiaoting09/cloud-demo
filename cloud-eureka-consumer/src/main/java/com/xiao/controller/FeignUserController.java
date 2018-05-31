package com.xiao.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xiao.feign.FeignUrlServer;
import com.xiao.feign.IUserServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 肖亭
 * @since 2018年05月29 22:16
 **/
@Slf4j
@RestController
@RequestMapping(value = "/feign/demo")
public class FeignUserController {
    @Autowired
    private IUserServer userServer;
    @Autowired
    private FeignUrlServer feignUrlServer;
    //信号量隔离  默认线程池隔离
    //@HystrixCommand(fallbackMethod = "getFallback", commandProperties = @HystrixProperty(name = HystrixPropertiesManager.EXECUTION_ISOLATION_STRATEGY,value = "SEMAPHORE"))
    @RequestMapping(value = "/user/{id}")
    public String getFeignUser(@PathVariable(value = "id") Integer id) {
        return userServer.getProvider(id);
    }
    private String getFallback(Integer id){
        log.info("----------服务调用失败-----------");

        return "异常返回";
    }


    @RequestMapping(value = "{id}.html")
    public String getBaiduWd(@PathVariable(value = "id") Integer wd) {
        return feignUrlServer.getWd(wd);
    }

}
