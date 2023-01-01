package com.lemon.spring2.dao;

import com.lemon.spring2.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.ObjectError;

@Repository
public class BookDaoImpl implements BookDao{

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加的方法
    @Override
    public void add(Book book) {
        // 1. 创建sql语句
        String  sql = "insert into t_book values(?,?,?)";
        // 2. 调用方法实现
        Object[] args = {book.getUserid(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    // 修改的方法
    @Override
    public void update(Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserid()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    // 删除的方法
    @Override
    public void delete(int id) {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }
}
