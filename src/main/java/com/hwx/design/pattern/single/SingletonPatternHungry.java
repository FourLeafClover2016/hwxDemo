package com.hwx.design.pattern.single;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description: 单例设计模式 -- 饿汉式
 */
public class SingletonPatternHungry {
    private SingletonPatternHungry() {
    }

    /**
     * 饿汉式 1: 静态变量初始化
     */
    private static SingletonPatternHungry instance1 = new SingletonPatternHungry();

    public static SingletonPatternHungry getInstance1() {
        return instance1;
    }


    /**
     * 饿汉式 2：静态代码块初始化变量
     */
    private static SingletonPatternHungry instance2;

    static {
        instance2 = new SingletonPatternHungry();
    }

    public static SingletonPatternHungry getInstance2() {
        return instance2;
    }

}
