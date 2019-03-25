package com.zyq.myemptyproject.service.user;

import org.apache.catalina.User;

/**
 * 用户服务
 *
 * @author 11963
 * @date 2019/3/25
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    void addUser(User user);

}
