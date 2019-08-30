package com.hwx.jdkproxy.util;

import com.hwx.jdkproxy.inter.MyInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {
    private Object object;
    private MyInterface myInterface;

    public static Object getBean(Object object, MyInterface myInterface) {
        ProxyBeanUtil _this = new ProxyBeanUtil();
        _this.object = object;
        _this.myInterface = myInterface;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), _this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObject = null;
        boolean exceptionFlag = false;
        myInterface.before(object);
        try {
            retObject = method.invoke(object, args);
        } catch (Exception e) {
            exceptionFlag = true;
        } finally {
            myInterface.after(object);
        }
        if (exceptionFlag) {
            myInterface.afterThrowing(object);
        } else {
            myInterface.afterRunning(object);
        }
        return retObject;
    }
}
