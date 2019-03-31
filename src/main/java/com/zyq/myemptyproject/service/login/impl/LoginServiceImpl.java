package com.zyq.myemptyproject.service.login.impl;

import com.zyq.myemptyproject.common.customenum.LoginCodeEnum;
import com.zyq.myemptyproject.dao.UserDAO;
import com.zyq.myemptyproject.entity.User;
import com.zyq.myemptyproject.service.login.LoginService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 登录服务
 */
@Service
@Validated
public class LoginServiceImpl implements LoginService {
    /**
     * 用户DAO
     */
    @Autowired
    UserDAO userDAO;

    /**
     * 校验用户名和密码
     *
     * @param loginName 登录用户名
     * @param password  密码
     * @return LoginCodeEnum
     * @see LoginCodeEnum
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    public LoginCodeEnum validateUserByUserNameAndPassword(@NotBlank String loginName, @NotBlank String password, @NotNull HttpSession httpSession) {
        // 默认返回103
        LoginCodeEnum loginCodeEnum = LoginCodeEnum.LOGINNAME_AND_PASSWORD_ERROR;
        User user = userDAO.findUserByLoginNameEquals(loginName);
        if (null == user) {
            // 没有此用户
            loginCodeEnum = LoginCodeEnum.NOT_USER;
        } else if (1 == (null == user.getLocked() ? 0 : user.getLocked())) {
            // 用户已经锁定
            // 记录登录错误
            recordLoginError(user);
            user.setGmtUpdateTime(new Date());
            userDAO.save(user);
            loginCodeEnum = LoginCodeEnum.USER_LOCKED;
        } else if (!user.getPassword().equals(password)) {
            // 用户密码输入错误
            // 记录登录错误
            recordLoginError(user);
            user.setGmtUpdateTime(new Date());
            userDAO.save(user);
            loginCodeEnum = LoginCodeEnum.PASSWORD_ERROR;
        } else {
            //将信息填入session
            httpSession.setAttribute("user", new User(user.getUserName(), user.getLoginName(), user.getPhone(),
                    user.getMail(), user.getLocked()));
            // 更新最新登录时间
            Date now = new Date();
            user.setLastLoginTime(now);
            user.setGmtUpdateTime(now);
            user.setErrorLoginNumber(0);
            userDAO.save(user);
            loginCodeEnum = LoginCodeEnum.LOGIN_RIGHT;
        }
        return loginCodeEnum;
    }

    /**
     * 记录登录失败的次数，错误次数>=3时，锁定账户
     *
     * @param user
     */
    private void recordLoginError(User user) {
        int errorLoginNumber = (null == user.getErrorLoginNumber() ? 1 : user.getErrorLoginNumber() + 1);
        user.setErrorLoginNumber(errorLoginNumber);
        if (0 == (null == user.getLocked() ? 0 : user.getLocked()) && errorLoginNumber >= 3) {
            user.setLocked(1);
        }
    }
}
