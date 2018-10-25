package com.example.news.user.mapper;

import com.example.news.user.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by george on 2018/10/25.
 */
@Mapper
public interface UserMapper {
    @Select("select id,mobile,password from news_user where mobile = #{mobile} and password = #{password}")
    List<UserBean> selectUser(String mobile, String password);
}
