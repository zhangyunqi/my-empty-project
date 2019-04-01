package com.zyq.myemptyproject.controller.user;

import com.zyq.myemptyproject.common.util.PageUtils;
import com.zyq.myemptyproject.entity.User;
import com.zyq.myemptyproject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户管理
 *
 * @author zhangyq
 * @date 2019/03/31
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    /**
     * 用户管理服务
     */
    @Autowired
    private UserService userService;

    /**
     * 跳转到用户管理页面
     * @param modelAndView
     * @return
     */
    @GetMapping(value = "/toUserMamagerPage")
    public ModelAndView toUserMamagerPage(ModelAndView modelAndView){
//        Page<User> page = userService.getUsersOfPage();
//        modelAndView.addAllObjects(PageUtils.pageAttributeToMap(page));
        modelAndView.setViewName("/user/userManager");
        return modelAndView;
    }
}
