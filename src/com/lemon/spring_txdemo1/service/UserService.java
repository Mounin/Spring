package com.lemon.spring_txdemo1.service;

import com.lemon.spring_txdemo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney() {
        // lucy少100
        userDao.reduceMoney();

        // mary多100
        userDao.addMoney();
    }
}
