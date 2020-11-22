package cn.xinil.test.spring;

import cn.xinil.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest_2 {

    @Test
    public void Test_2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student)context.getBean("student");
        System.out.println(student);
    }
}
