package com.hwx.aspect.aspect;

import com.hwx.aspect.annotation.ApiLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApiLogAspect {
    @Around("@annotation(apiLog)")
    public Object around(ProceedingJoinPoint point, ApiLog apiLog) throws Throwable {
        System.out.println("----------------日志切面");
        return point.proceed();
    }

}
