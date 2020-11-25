package cn.xinil.test.aop_1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * MethodBeforeAdvice前置增强
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method  要执行的目标对象的方法
     * @param args  参数
     * @param target    目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass()+"的"+method.getName()+"被执行了。");
    }
}
