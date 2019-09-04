package com.hwx.jdkproxy;

import com.hwx.Application;
import com.hwx.jdkproxy.inter.MyInterface;
import com.hwx.jdkproxy.inter.imp.MyInterfaceImp;
import com.hwx.jdkproxy.service.RoleService;
import com.hwx.jdkproxy.service.imp.RoleServiceImp;
import com.hwx.jdkproxy.util.ProxyBeanFactory;
import com.hwx.jdkproxy.util.ProxyBeanUtil;
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
