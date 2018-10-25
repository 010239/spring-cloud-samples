package com.example.news.user.model;

import com.example.news.common.model.BaseModel;

/**
 * Created by george on 2018/10/25.
 */
public class UserBean extends BaseModel {
    private String mobile;
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
