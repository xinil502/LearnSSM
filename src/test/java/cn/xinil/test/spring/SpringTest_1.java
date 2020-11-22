package cn.xinil.test.spring;

import cn.xinil.domain.Spring;
import cn.xinil.domain.User;
import cn.xinil.service.ISpringService;
import cn.xinil.service.impl.SpringServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest_1 {

    @Test
    public void test_1(){
        //获取ApplicationContext —— (Spring的 容器/上下文对象)
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //我们的对象现在都在Spring中管理了，使用时直接取出来就可以了。
        Spring spring = (Spring) context.getBean("testBean");
        System.out.println(spring);


    }
}
