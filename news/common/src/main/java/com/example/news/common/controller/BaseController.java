package com.example.news.common.controller;

import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * Created by george on 2018/10/25.
 */
public abstract class BaseController {
    /**
     * 接口输入参数合法性校验
     *
     * @param result
     */
    protected void validate(BindingResult result){
        if(result.hasFieldErrors()){
            List<FieldError> errorList = result.getFieldErrors();
            errorList.stream().forEach(item -> Assert.isTrue(false,item.getDefaultMessage()));
        }
    }
}
