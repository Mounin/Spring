package com.lemon.spring1.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect // 生成代理对象
public class UserProxy {

    // 前置通知
    @Before(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void before() {
        System.out.println("before.....");
    }

    // 最终通知
    @After(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void after() {
        System.out.println("after.....");
    }

    // 后置（返回）通知
    @AfterReturning(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.....");
    }

    // 环绕通知
    @Around(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前.....");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.....");
    }
}
