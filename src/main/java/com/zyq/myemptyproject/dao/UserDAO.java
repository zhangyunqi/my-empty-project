package com.zyq.myemptyproject.dao;

import com.zyq.myemptyproject.common.base.BaseRepository;
import com.zyq.myemptyproject.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends BaseRepository<User, Long> {
    /**
     * 根据登录用户名查询用户
     *
     * @param loginName 登录用户名
     * @return
     */
    User findUserByLoginNameEquals(String loginName);

    /**
     * 校验登录用户名和密码是否存在
     *
     * @param loginName 登录用户名
     * @param password  密码
     * @return
     */
    boolean existsUserByLoginNameEqualsAndPasswordEquals(String loginName, String password);

    /**
     * 查询用户锁定状态
     *
     * @param loginName 登录用户名
     * @return
     */
    @Query("SELECT t.locked from User t where t.loginName=?1")
    String isBlocked(String loginName);

}
