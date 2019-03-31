package com.zyq.myemptyproject.common.customenum;

/**
 * 登录返回码
 */
public enum LoginCodeEnum {
    /**
     * 登录成功
     */
    LOGIN_RIGHT("100","登录成功"),
    /**
     * 没有此用户
     */
    NOT_USER("101", "没有此用户"),
    /**
     * 用户密码输入错误
     */
    PASSWORD_ERROR("102", "密码错误"),
    /**
     * 用户名或者密码错误
     */
    LOGINNAME_AND_PASSWORD_ERROR("103", "用户名或者密码错误"),
    /**
     * 用户已锁定
     */
    USER_LOCKED("104", "此用户已经被锁定");

    /**
     * 登录返回代码
     */
    private String code;
    /**
     * 默认错误信息
     */
    private String defaultErrorMessage;

    LoginCodeEnum(String code, String defaultErrorMessage) {
        this.code = code;
        this.defaultErrorMessage = defaultErrorMessage;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefaultErrorMessage() {
        return defaultErrorMessage;
    }

    public void setDefaultErrorMessage(String defaultErrorMessage) {
        this.defaultErrorMessage = defaultErrorMessage;
    }
}
