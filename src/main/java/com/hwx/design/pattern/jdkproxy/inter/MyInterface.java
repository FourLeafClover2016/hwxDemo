package com.hwx.design.pattern.jdkproxy.inter;

public interface MyInterface {
    void before(Object object);

    void after(Object object);

    void afterRunning(Object object);

    void afterThrowing(Object object);
}
