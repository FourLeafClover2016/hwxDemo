package com.hwx.design.pattern.single;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description: 懒汉式设计模式
 */
public class SingletonPatternLazy {
    private SingletonPatternLazy() {
    }

    /**
     * 懒汉式 1：多线程会出现线程安全问题
     */
    private static SingletonPatternLazy instance1;

    public static SingletonPatternLazy getInstance1() {
        if (instance1 == null) {
            instance1 = new SingletonPatternLazy();
        }
        return instance1;
    }

    /**
     * 懒汉式 2：双重检查, 看似安全，但是JVM指令重排，多线程情况下依然会出现问题
     * 使用volatile线程之间的可见性
     */
    private volatile static SingletonPatternLazy instance2;

    public static SingletonPatternLazy getInstance2() {
        if (instance2 == null) {
            synchronized (SingletonPatternLazy.class) {
                if (instance2 == null) {
                    instance2 = new SingletonPatternLazy();
                }
            }
        }
        return instance2;
    }

    /**
     * 懒汉式 3：静态内部类
     */
    private static class SingletonPatternHolder {
        private static final SingletonPatternLazy INSTANCE = new SingletonPatternLazy();
    }

    public static SingletonPatternLazy getInstance3() {
        return SingletonPatternHolder.INSTANCE;
    }

    /**
     * 饿汉式 4：使用枚举
     */
    public enum SingletonPatternEnum {
        INSTANCE;
        private final SingletonPatternLazy instance4;

        SingletonPatternEnum() {
            instance4 = new SingletonPatternLazy();
        }

        private SingletonPatternLazy getInstance4() {
            return instance4;
        }
    }

    public static SingletonPatternLazy getInstance4() {
        return SingletonPatternEnum.INSTANCE.getInstance4();
    }


}
