package com.vasanth.user.controller;

import com.vasanth.user.service.UserService;
import com.vasanth.user.shared.Authentication;
import com.vasanth.user.shared.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    // to do
    @RequestMapping(method = RequestMethod.POST,value = "/verify")
    public ResponseEntity<Authentication> findAll(@RequestBody Credentials credentials){
        return ResponseEntity.status(HttpStatus.OK).body(userService.verify(credentials));
    }
}
