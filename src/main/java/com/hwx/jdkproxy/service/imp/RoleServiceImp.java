package com.hwx.jdkproxy.service.imp;

import com.hwx.jdkproxy.service.RoleService;

public class RoleServiceImp implements RoleService {
    @Override
    public void printfRole() {
        System.out.println("role is admin");
        int i = 1/0;
    }
}
