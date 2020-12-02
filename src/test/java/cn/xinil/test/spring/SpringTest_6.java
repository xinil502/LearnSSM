package cn.xinil.test.spring;

import cn.xinil.test.aop_3.AnnotationPointCut;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest_6 {

    @Test
    public void test_6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationPointCut pointCut = (AnnotationPointCut)context.getBean("annotationPointCut");

    }
}
