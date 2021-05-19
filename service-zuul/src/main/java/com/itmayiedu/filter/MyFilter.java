package com.itmayiedu.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class MyFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 请求参数中没有传入token参数 直接返回报错信息
	 * 传入token参数可以正常访问请求
	 */
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("token");
		if (accessToken != null) {
			return null;
		}
		log.warn("token is empty");
		ctx.setSendZuulResponse(false);
		ctx.setResponseStatusCode(401);
		try {
			ctx.getResponse().getWriter().write("token is empty");
		} catch (Exception e) {
		}
		return null;

	}
}
