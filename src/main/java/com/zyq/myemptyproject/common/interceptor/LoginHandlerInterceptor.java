package com.zyq.myemptyproject.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截
 *
 * @author zhangyunqi
 * @date 2019/03/14
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     * 请求处理之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession();
        //这里的User是登陆时放入session的
        User user = (User) session.getAttribute("user");
        return false;
    }
}
