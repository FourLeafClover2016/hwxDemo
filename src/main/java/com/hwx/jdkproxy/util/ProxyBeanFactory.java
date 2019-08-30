package com.hwx.jdkproxy.util;

import com.hwx.jdkproxy.inter.MyInterface;

public class ProxyBeanFactory {
    public  static <T> T getBean(T object, MyInterface myInterface) {
        return (T)ProxyBeanUtil.getBean(object, myInterface);
    }
}
