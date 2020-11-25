package cn.xinil.test.aop_1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置增强
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     *
     * @param returnValue   返回值
     * @param method    要执行的目标对象的方法
     * @param args      参数
     * @param target    目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass()+"的"+method.getName()+"被执行了,得到的返回结果是："+returnValue);
    }
}
