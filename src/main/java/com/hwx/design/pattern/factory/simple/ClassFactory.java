package com.hwx.design.pattern.factory.simple;

import com.hwx.design.pattern.factory.common.AbClass;
import com.hwx.design.pattern.factory.common.PythonClass;
import com.hwx.design.pattern.factory.common.JavaClass;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description: 简单/静态工厂
 */
public class ClassFactory {
    public static AbClass createClass(String type) {
        if ("java".equals(type)) {
            return new JavaClass();
        } else if ("python".equals(type)) {
            return new PythonClass();
        } else {
            return null;
        }
    }

}
