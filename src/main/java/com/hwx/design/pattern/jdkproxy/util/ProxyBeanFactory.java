package com.hwx.design.pattern.jdkproxy.util;

import com.hwx.design.pattern.jdkproxy.inter.MyInterface;

public class ProxyBeanFactory {
    public  static <T> T getBean(T object, MyInterface myInterface) {
        return (T)ProxyBeanUtil.getBean(object, myInterface);
    }
}
