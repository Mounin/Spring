package com.lemon.spring2.dao;

import com.lemon.spring2.entity.Book;

public interface BookDao {
    // 添加的方法
    void add(Book book);

    // 修改的方法
    void update(Book book);

    // 删除的方法
    void delete(int id);
}
