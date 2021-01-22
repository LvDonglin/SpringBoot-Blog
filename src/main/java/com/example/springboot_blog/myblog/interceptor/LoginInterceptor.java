package com.example.springboot_blog.myblog.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @ProjectName: springboot_blog
 * @Package: com.example.springboot_blog.myblog.interceptor
 * @ClassName: LoginInterceptor
 * @Author: 吕东霖
 * @Description: ${description}
 * @Date: 2020/11/30 16:37
 * @Version: 1.0
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
//  判断session里面是否有用户，没有的话重定向到登录页面，给拦截掉
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/admin");
            return false;
        }
        return true;
    }
}
