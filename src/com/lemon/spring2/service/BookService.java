package com.lemon.spring2.service;

import com.lemon.spring2.dao.BookDao;
import com.lemon.spring2.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加的方法
    public void addBook(Book book) {
        bookDao.add(book);
    }
}
