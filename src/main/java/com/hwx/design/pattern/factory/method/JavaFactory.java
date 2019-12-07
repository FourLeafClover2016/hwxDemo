package com.hwx.design.pattern.factory.method;

import com.hwx.design.pattern.factory.common.AbClass;
import com.hwx.design.pattern.factory.common.JavaClass;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class JavaFactory implements MethodFactory {

    @Override
    public AbClass getAbClass() {
        return new JavaClass();
    }
}
