package com.hwx.design.pattern.factory.method;

import com.hwx.design.pattern.factory.common.AbClass;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class MethodFactoryTest {
    public static void main(String[] args) {
        MethodFactory pythonFactoy = new PythonFactory();
        AbClass python = pythonFactoy.getAbClass();
        python.study();
    }
}
