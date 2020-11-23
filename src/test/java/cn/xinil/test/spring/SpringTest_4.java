package cn.xinil.test.spring;

import cn.xinil.config.PeopleConfig;
import cn.xinil.domain.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest_4 {

    @Test
    public void test_4(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PeopleConfig.class);
        People people = (People)context.getBean("people_1");

        people.getCat().fit();
        people.getDog().fit();

    }
}
