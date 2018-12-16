package com.xy.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

/**
 * 过滤器
 *
 * @author zxc
 * @since 2017/8/13 下午10:53
 */
@Component
//@Slf4j
public class AccessFilter extends ZuulFilter {

    static final private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * 返回过滤器的类型,有pre、route、post、error等几种取值，分别对应上文的几种过滤器
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 返回一个int值来指定过滤器的执行顺序，不同的过滤器允许返回相同的数字
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 返回一个boolean值来判断该过滤器是否要执行，true表示执行，false表示不执行
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     *
     * @return
     */
    @Override
    public Object run() {

        //接受请求 记录请求信息
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        // 记录下请求内容
//        log.info("URL : " + request.getRequestURL().toString());
//        log.info("HTTP_METHOD : " + request.getMethod());
//        log.info("IP : " + request.getRemoteAddr());
        // logger.info("URL=============="+request.getRequestURI().toString()

        // currentContext.getResponse().getWriter().write("token is empty!!!");
        //通过context.setSendZuulResponse(false)可以终止请求的转发，但是只在pre类型的过滤器中设置才可以。
        //currentContext.setResponseStatusCode(401);
       // currentContext.setResponseBody("{\"result\":\"pre01Filter auth not correct!\"}");


        logger.info(String.format("send %s request to %s", request.getMethod(), request.getRequestURL().toString()));
        return null;

    }
}
