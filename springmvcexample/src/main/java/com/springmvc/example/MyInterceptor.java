package com.springmvc.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor  extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("this is pre handler");
		String name= request.getParameter("user");
		
		if (name.startsWith("d")) {
			
			response.setContentType("text.html");
			response.getWriter().println("invilid name....name should not startt with d");
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("this is post handler");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
System.out.println("this is after completion method");	
super.afterConcurrentHandlingStarted(request, response, handler);
	}

}
