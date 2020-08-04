package com.vasanth.user.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {
    public User() {
    }

    @Id
    @GeneratedValue
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
    private String userType;//(if Admin or normal User)
    private String email;
    private long mobileNumber;
    private String confirmed;


    public User(int id, String username, String password, String userType, String email, long mobileNumber, String confirmed) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.confirmed = confirmed;
    }
}
