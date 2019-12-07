package com.hwx.design.pattern.factory.method;

import com.hwx.design.pattern.factory.common.AbClass;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description: 工厂接口, 让子类决定实例化哪个类
 */
public interface MethodFactory {
    AbClass getAbClass();
}
