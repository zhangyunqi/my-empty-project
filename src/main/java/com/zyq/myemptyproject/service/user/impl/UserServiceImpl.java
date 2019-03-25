package com.zyq.myemptyproject.service.user.impl;

import com.zyq.myemptyproject.dao.UserDAO;
import com.zyq.myemptyproject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务
 *
 * @author 11963
 * @date 2019/3/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = RuntimeException.class)
    public void addUser(User user) {

        userDAO.save(user);

    }
}
