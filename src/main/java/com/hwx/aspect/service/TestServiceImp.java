package com.hwx.aspect.service;

import com.hwx.aspect.annotation.ApiLog;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImp implements TestService{
     @ApiLog("测试")
     @Override
    public String getStr(){
        System.out.println("service Test");
        return "success";
    }
}
