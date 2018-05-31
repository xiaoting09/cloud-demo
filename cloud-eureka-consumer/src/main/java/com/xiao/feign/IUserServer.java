package com.xiao.feign;

import com.xiao.configuration.UserHystrixServer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务接口
 *
 * @author 肖亭
 * @since 2018年05月29 22:08
 */
@FeignClient(name = "erekaProvider", fallback = UserHystrixServer.class)
public interface IUserServer {
    @RequestMapping(value = "/api/user/{id}")
    String getProvider(@PathVariable(value = "id") Integer id);
}
