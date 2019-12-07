package com.hwx.design.pattern.jdkproxy;

import com.hwx.Application;
import com.hwx.design.pattern.jdkproxy.inter.MyInterface;
import com.hwx.design.pattern.jdkproxy.inter.imp.MyInterfaceImp;
import com.hwx.design.pattern.jdkproxy.service.RoleService;
import com.hwx.design.pattern.jdkproxy.service.imp.RoleServiceImp;
import com.hwx.design.pattern.jdkproxy.util.ProxyBeanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class test {
    @Test
    public void test1() {
        RoleService roleService = new RoleServiceImp();
        MyInterface myInterface = new MyInterfaceImp();
        RoleService proxy = ProxyBeanFactory.getBean(roleService, myInterface);
        proxy.printfRole();
    }
}
