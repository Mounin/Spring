package com.lemon.spring_txdemo1.service;

import com.lemon.spring_txdemo1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = false, timeout = -1, propagation = Propagation.REQUIRED)
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney() {
        // 编程时方式事务管理
//        try {
//            // 第一步 开启事务
//
//            // 第二步 进行事务操作
//            // lucy少100
//            userDao.reduceMoney();
//
//            // mary多100
//            userDao.addMoney();
//
//            // 第三步 没有发生异常，提交事务
//        } catch (Exception e) {
//            //第四步 出现异常，事务回滚
//        }
            // lucy少100
            userDao.reduceMoney();

//            int i = 10 / 0;

            // mary多100
            userDao.addMoney();
    }
}
