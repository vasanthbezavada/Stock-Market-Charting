package com.vasanth.user.service;

import com.vasanth.user.model.User;
import com.vasanth.user.shared.Authentication;
import com.vasanth.user.shared.Credentials;

public interface UserService {
    public void saveUser(User user);
    public Authentication verify(Credentials credentials);
}
