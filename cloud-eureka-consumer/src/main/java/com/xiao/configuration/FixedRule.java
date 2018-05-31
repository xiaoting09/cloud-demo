package com.xiao.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 自定义Ribbon的负载均衡策略
 */
@Slf4j
public class FixedRule extends AbstractLoadBalancerRule {

    private Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            // 可用的服务实例z
            List<Server> upList = lb.getReachableServers();
            for (Server s : upList) {
                if (s.getPort() == 9004) {
                    server = s;
                }
            }

            if (server == null) {
                Thread.yield();
                continue;
            }

            log.info("实例IP{}, 端口：{}", server.getHost(), server.getPort());

            if (server.isAlive()) {
                return (server);
            }

            server = null;
            Thread.yield();
        }

        return server;
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
        // TODO Auto-generated method stub
    }

}
