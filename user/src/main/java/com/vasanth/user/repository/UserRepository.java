package com.vasanth.user.repository;

import com.vasanth.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRepository {
    @Autowired
    UserService userService;
    // to do
}
