package com.zyq.myemptyproject.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * home页请求
 *
 * @author zhangyq
 * @date 2019/03/31
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    /**
     * 跳转到HOME页面
     *
     * @param modelAndView
     * @return
     */
    @GetMapping(value = "/tohome")
    public ModelAndView toHome(ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        return modelAndView;
    }
    /**
     * 跳转到HOME页面
     *
     * @param modelAndView
     * @return
     */
    @GetMapping(value = "/tohome1")
    public ModelAndView toHome1(ModelAndView modelAndView) {
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
