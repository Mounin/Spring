package com.lemon.spring_txdemo1.test;

import com.lemon.spring_txdemo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTX {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
