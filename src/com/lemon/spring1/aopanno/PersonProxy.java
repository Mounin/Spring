package com.lemon.spring1.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect // 生成代理对象
@Order(1)
public class PersonProxy {

    // 前置通知
    @Before(value = "execution(* com.lemon.spring1.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person before.....");
    }
}
