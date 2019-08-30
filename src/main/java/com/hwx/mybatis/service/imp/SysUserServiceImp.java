package com.hwx.mybatis.service.imp;

import com.hwx.mybatis.compone.SpringUtil;
import com.hwx.mybatis.entity.SysRole;
import com.hwx.mybatis.entity.SysUser;
import com.hwx.mybatis.mapper.SysRoleMapper;
import com.hwx.mybatis.mapper.SysUserMapper;
import com.hwx.mybatis.service.SysUserService;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class SysUserServiceImp implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert() {
        System.out.println(SpringUtil.getBean(this.getClass()) == this);
        System.out.println(this == this);
        SysUser sysUser = new SysUser();
        sysUser.setUsername("test");
        sysUser.setCreateTime(new Date());
        sysUser.setPasswd("123456");
        sysUser.setRoleId(1);
        sysUser.setId(11);
        sysUserMapper.insert(sysUser);

        SpringUtil.getBean(this.getClass()).insertTest();
      //   insertTest();
    }
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    public void insertTest(){
        SysRole sysRole = new SysRole();
        sysRole.setAvilable(1);
        sysRole.setId(10);
        sysRole.setRoleName("user");
        SysUser sysUser = new SysUser();
        sysUser.setUsername("test");
        sysUser.setCreateTime(new Date());
        sysUser.setPasswd("123456");
        sysUser.setRoleId(1);
        sysUser.setId(10);
        sysRoleMapper.insert(sysRole);
     //   int i = 1/0;
        sysUserMapper.insert(sysUser);


    }
}
