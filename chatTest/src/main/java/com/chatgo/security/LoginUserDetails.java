package com.chatgo.security;

import com.chatgo.business.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class LoginUserDetails extends org.springframework.security.core.userdetails.User{

    private int userId;
    private String username;


    public LoginUserDetails(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.userId = user.getId();
        this.username = user.getUsername();
    }

    public int getUserId() {
        return userId;
    }
    public String getUserNickname() {
        return userNickname;
    }

}