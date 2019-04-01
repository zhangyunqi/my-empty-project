package com.zyq.myemptyproject.service.user.impl;

import com.zyq.myemptyproject.dao.UserDAO;
import com.zyq.myemptyproject.entity.User;
import com.zyq.myemptyproject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.naming.ldap.PagedResultsControl;
import java.util.Date;

/**
 * 用户服务
 *
 * @author 11963
 * @date 2019/3/25
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    public void addUser(User user) {
        Date date = new Date();
        user.setGmtCreateTime(date);
        user.setPassword("888888");
        user.setLocked(0);
        user.setDeleted(0);
        user.setErrorLoginNumber(0);
        userDAO.save(user);
    }

    /**
     * 根据主键删除用户
     *
     * @param id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    public void deleteUserByIdOfLogic(Long id) {
        userDAO.deleteByIdOfLogic(id);
    }

    /**
     * 批量删除用户
     *
     * @param users
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    public void deleteUsers(Iterable<User> users) {
        userDAO.deleteAll(users);
    }

    /**
     * 分页查询用户，未删除的
     *
     * @return
     */
    @Override
    public Page<User> getUsersOfPage() {
        // 构建未删除状态的查询条件
        User user = new User();
        user.setDeleted(0);
        Example<User> example = Example.of(user);
        Page<User> userPage = userDAO.findAll(example,PageRequest.of(1,10));
        return userPage;
    }
}
