package com.lemon.spring_txdemo1.test;

import com.lemon.spring_txdemo1.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  // 单元测试框架
@ContextConfiguration("classpath:bean3.xml")  // 加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void testMoney() {
        userService.accountMoney();
    }
}
