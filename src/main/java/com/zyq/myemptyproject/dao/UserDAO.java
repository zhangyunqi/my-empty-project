package com.zyq.myemptyproject.dao;

import com.zyq.myemptyproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
}
