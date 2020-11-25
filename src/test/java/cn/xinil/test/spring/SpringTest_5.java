package cn.xinil.test.spring;

import cn.xinil.test.aop_1.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest_5 {
    @Test
    public void test_5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.update();
    }
}
