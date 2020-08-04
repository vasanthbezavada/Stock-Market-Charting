package com.vasanth.user.service;

import com.vasanth.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    // to do
}
