package com.zyq.myemptyproject.controller.login;

import com.zyq.myemptyproject.common.customenum.LoginCodeEnum;
import com.zyq.myemptyproject.entity.User;
import com.zyq.myemptyproject.service.login.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * 登录登出
 *
 * @author zhangyunqi
 * @date 2019/03/13
 */
@Controller
@Validated
public class LoginController {
    @Autowired
    LoginService loginService;

    /**
     * 跳转登录页面
     *
     * @param modelAndView
     * @return
     */
    @GetMapping(value = "/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }

    /**
     * 登录操作
     *
     * @param loginName
     * @param password
     * @param httpSession
     * @param modelAndView
     * @return
     */
    @PostMapping(value = "/login")
    public ModelAndView login(String loginName,
                              String password,
                              HttpSession httpSession,
                              ModelAndView modelAndView) {
        if (StringUtils.isAllBlank(loginName, password)) {
            modelAndView.setViewName("redirect:/login");
        }
        LoginCodeEnum loginCodeEnum = loginService.validateUserByUserNameAndPassword(loginName,password,httpSession);
        if (LoginCodeEnum.LOGIN_RIGHT.getCode().equals(loginCodeEnum.getCode())){
            //登录成功
            modelAndView.setViewName("redirect:/index");
        }else {
            modelAndView.addObject("code", loginCodeEnum.getCode());
            modelAndView.addObject("message",loginCodeEnum.getDefaultErrorMessage());
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }

    /**
     * 登出
     *
     * @param httpSession
     * @param modelAndView
     * @return
     */
    @PostMapping("/logout")
    public ModelAndView logout(HttpSession httpSession, ModelAndView modelAndView) {
        // 清除session
        httpSession.invalidate();
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
