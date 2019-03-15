package com.zyq.myemptyproject.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录登出
 *
 * @author zhangyunqi
 * @date 2019/03/13
 */
@Controller
public class LoginController {
    @RequestMapping(value = {"login",""})
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
