package com.example.news.user.model.request;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by george on 2018/10/25.
 */
public class LoginRequest {
    @NotEmpty
    private String mobile;
    @NotEmpty
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
