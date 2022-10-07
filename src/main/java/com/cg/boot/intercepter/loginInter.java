package com.cg.boot.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 配置登录拦截
 * 1、继承HandlerInterceptor，编写拦截逻辑
 * 2、创建注解类，定制化SpringMVC，指定拦截路径
 *
 */

public class loginInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //访问资源前拦截

        //获取session，获取登录信息
        HttpSession session = request.getSession();
        Object logUser = session.getAttribute("logUser");
        if(logUser!=null){
            return true;
        }
        //添加登录的提示反馈信息
        request.setAttribute("error","请先登录");

        //拦截住的跳转至登陆页面
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {



    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
