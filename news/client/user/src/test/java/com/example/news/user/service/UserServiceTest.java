package com.example.news.user.service;

import com.example.news.user.Application;
import com.example.news.user.model.request.LoginRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by george on 2018/10/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void login() throws Exception {
        LoginRequest request = new LoginRequest();
        request.setMobile("13800138000");
        request.setPassword("1");
        System.out.println(userService.login(request));
    }

}