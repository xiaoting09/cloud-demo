package com.xiao.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * 权限拦截
 *
 * @author 肖亭
 * @since 2018年05月31 17:37
 **/
@Slf4j
public class AccessFilter extends ZuulFilter {
    //返回一个字符串代表过滤器的类型
    //可以在请求被路由之前调用 pre
    //在路由请求时候被调用 routing
    //在routing和error过滤器之后被调用 post
    //处理请求时发生错误时被调用 error
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //通过int值来定义过滤器的执行顺序
    @Override
    public int filterOrder() {
        return Integer.MAX_VALUE;
    }
    //返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关 返回true，所以该过滤器总是生效。
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("{} request to {}",request.getMethod(),request.getRequestURL().toString());
        String token = request.getParameter("accessToken");
        if (token==null || token.trim().length()==0){
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }
}
