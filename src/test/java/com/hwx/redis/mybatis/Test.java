package com.hwx.redis.mybatis;

import com.hwx.Application;
import com.hwx.mybatis.entity.SysUser;
import com.hwx.mybatis.mapper.SysUserMapper;
import com.hwx.mybatis.service.SysUserService;
import com.hwx.mybatis.service.imp.SysUserServiceImp;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class Test {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserServiceImp sysUserService;
    @org.junit.Test
    public void test(){
     //   SysUser sysUser = sysUserMapper.selectById(2);
   //     System.out.println(sysUser.getSysRole());
    //    int  i =0;
        sysUserService.insert();
       // sysUserService.insertTest();
    }

    @org.junit.Test
    public void test2(){
        SysUser sysUser = sysUserMapper.selectById(2);
        System.out.println(sysUser.getSysRole());
        System.out.println("--------");
    }
}
