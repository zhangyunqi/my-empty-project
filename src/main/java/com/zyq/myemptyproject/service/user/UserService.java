package com.zyq.myemptyproject.service.user;

import com.zyq.myemptyproject.entity.User;
import org.springframework.data.domain.Page;

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
     * 通过ID删除用户下【逻辑删除】
     *
     * @param id
     */
    void deleteUserByIdOfLogic(Long id);

    /**
     * 通过多个实体批量删除用户
     *
     * @param users
     */
    void deleteUsers(Iterable<User> users);

    /**
     * 分页查询用户，未删除的
     *
     * @return
     */
    Page<User> getUsersOfPage();

}
