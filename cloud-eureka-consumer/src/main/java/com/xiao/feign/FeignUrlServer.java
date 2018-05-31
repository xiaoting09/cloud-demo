package com.xiao.feign;

import com.xiao.configuration.FooConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign指定请求地址
 *
 * @author 肖亭
 * @since 2018年05月30 10:02
 */
@FeignClient(name = "baidu", url = "https://www.cnblogs.com/kazihuo/p/",configuration = FooConfiguration.class)
public interface FeignUrlServer {
    @RequestMapping(value = "{id}.html")
    String getWd(@PathVariable(value = "id") Integer id);

}
