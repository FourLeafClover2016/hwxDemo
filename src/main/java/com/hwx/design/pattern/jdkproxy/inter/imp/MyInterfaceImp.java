package com.hwx.design.pattern.jdkproxy.inter.imp;

import com.hwx.design.pattern.jdkproxy.inter.MyInterface;

public class MyInterfaceImp implements MyInterface {
    @Override
    public void before(Object object) {
        System.out.println("调用之前");
    }

    @Override
    public void after(Object object) {
        System.out.println("调用之后");
    }

    @Override
    public void afterRunning(Object object) {
        System.out.println("正常运行");
    }

    @Override
    public void afterThrowing(Object object) {
        System.out.println("运行异常");
    }
}
