package com.zyq.myemptyproject.service.user;

import com.zyq.myemptyproject.entity.User;

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

    /**
     * 通过ID删除用户
     *
     * @param id
     */
    void deleteUserById(Long id);

    /**
     * 通过多个实体批量删除用户
     *
     * @param users
     */
    void deleteUsers(Iterable<User> users);

}
