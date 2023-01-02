package com.lemon.spring_txdemo1.test;

import com.lemon.spring_txdemo1.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean3.xml")  // 加载配置文件

// 使用复合注解代替上面的两个注解
@SpringJUnitConfig(locations = "classpath:bean3.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void testMoney() {
        userService.accountMoney();
    }
}
