package com.lemon.spring2.test;

import com.lemon.spring2.entity.Book;
import com.lemon.spring2.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserid(1);
        book.setUsername("java");
        book.setUstatus("read");
        bookService.addBook(book);
    }
}
