package com.hwx.design.pattern.factory.method;

import com.hwx.design.pattern.factory.common.AbClass;
import com.hwx.design.pattern.factory.common.PythonClass;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class PythonFactory implements MethodFactory {

    @Override
    public AbClass getAbClass() {
        return new PythonClass();
    }
}
