package cn.xinil.test.spring;

import cn.xinil.domain.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest_3 {
    @Test
    public void test_3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p = (People) context.getBean("people", People.class);

        p.getCat().fit();
        p.getDog().fit();
    }
}
