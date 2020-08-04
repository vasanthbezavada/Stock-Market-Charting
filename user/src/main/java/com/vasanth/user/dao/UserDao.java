package com.vasanth.user.dao;

import com.vasanth.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    public User findByUsername(String username);
}
