package com.vasanth.user.service;

import com.vasanth.user.dao.UserDao;
import com.vasanth.user.model.User;
import com.vasanth.user.shared.Authentication;
import com.vasanth.user.shared.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    // to do
    @Transactional
    public void saveUser(User user){
        userDao.save(user);
    }
    public Authentication verify(Credentials credentials){
        Authentication authentication = new Authentication();
        User user = userDao.findByUsername(credentials.getUserName());
        if(user.getPassword().equals(credentials.getPassword()))
            authentication.verified=true;
        else
            authentication.verified=false;
        return authentication;
    }
}
