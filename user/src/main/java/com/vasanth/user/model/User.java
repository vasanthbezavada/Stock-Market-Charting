package com.vasanth.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String userType;//(if Admin or normal User)
    private String email;
    private long mobileNumber;
    private String confirmed;
}
