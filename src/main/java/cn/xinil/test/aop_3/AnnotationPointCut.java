package cn.xinil.test.aop_3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {

    @Pointcut("execution(* cn.xinil.test.aop_1.UserServiceImpl.*(..))")
    public void p1(){}

    @Before("p1()") //切入点
    public void before(){
        System.out.println("方法执行前");
    }
    @After("p1()") //切入点
    public void After(){
        System.out.println("方法执行后");
    }

    @Around("p1()")
    public int a(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();
        System.out.println("sound前");
        Object objects = jp.proceed(args);
        System.out.println("sound后");
        return 1;
    }
}
