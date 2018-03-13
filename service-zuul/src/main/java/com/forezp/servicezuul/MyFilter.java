/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyFilter
 * Author:   92406
 * Date:     2018/3/13 9:44
 * Description: zuul不仅只是路由，并且还能过滤，做一些安全验证
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.forezp.servicezuul;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/13 9:44
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log= LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext ctx= RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        log.info(String.format("%s>>>%s",request.getMethod(),request.getRequestURL().toString()));
        Object accessToken= request.getParameter("token");
        if (accessToken==null){
            log.warn("token is empey");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        }try {
            ctx.getResponse().getWriter().write("token is empey");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        log.info("ok");
        return null;
    }
}
