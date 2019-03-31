package com.zyq.myemptyproject.service.login;

import com.zyq.myemptyproject.common.customenum.LoginCodeEnum;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 登录服务
 */
public interface LoginService {
    /**
     * 校验用户名和密码
     *
     * @param loginName 登录用户名
     * @param password  密码
     * @return LoginCodeEnum 登录错误码
     */
    LoginCodeEnum validateUserByUserNameAndPassword(@NotBlank String loginName, @NotBlank String password, @NotNull HttpSession httpSession);
}
