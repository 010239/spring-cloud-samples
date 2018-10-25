package com.example.news.user.controller;

import com.example.news.common.controller.BaseController;
import com.example.news.user.model.request.LoginRequest;
import com.example.news.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by george on 2018/10/25.
 */
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public SingleResult<TokenResponse> login(@Valid @RequestBody LoginRequest request, BindingResult result){
        //必须要调用validate方法才能实现输入参数的合法性校验
        validate(result);
        return userService.login(request);
    }
}
