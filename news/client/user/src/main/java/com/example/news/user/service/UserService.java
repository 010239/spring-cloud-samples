package com.example.news.user.service;

import com.example.news.common.service.BaseService;
import com.example.news.user.mapper.UserMapper;
import com.example.news.user.model.UserBean;
import com.example.news.user.model.request.LoginRequest;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by george on 2018/10/25.
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class UserService extends BaseService{
    @Autowired
    private UserMapper userMapper;

    public SingleResult<TokenResponse> login(LoginRequest request){
        List<UserBean> userList = userMapper.selectUser(request.getMobile(),request.getPassword());
        if(null != userList && userList.size() > 0){
            String token = getToken(request.getMobile(),request.getPassword());
            TokenResponse response = new TokenResponse();
            response.setToken(token);
            return SingleResult.buildSuccess(response);
        }else {
            return SingleResult.buildFailure(Code.ERROR,"手机号或密码输入不正确！");
        }
    }
}
