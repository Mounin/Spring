package com.lemon.spring2.test;

import com.lemon.spring2.entity.Book;
import com.lemon.spring2.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        // 测试添加方法
//        Book book = new Book();
//        book.setUserid(1);
//        book.setUsername("java");
//        book.setUstatus("read");
//        bookService.addBook(bo ok );

        // 测试修改方法
//        Book book = new Book();
//        book.setUserid(1);
//        book.setUsername("javaweb");
//        book.setUstatus("lemon");
//        bookService.updateBook(book);

        // 测试删除方法
//        Book book = new Book();
//        book.setUserid(1);
//        book.setUsername("javaweb");
//        book.setUstatus("lemon");
//        bookService.deleteBook(book.getUserid());

        // 测试查询表记录数
//        int count = bookService.findCount();
//        System.out.println(count);

        // 测试查询返回对象
//        Book book = bookService.findOne("3");
//        System.out.println(book);

        // 测试查询返回集合
//        List<Book> bookList = bookService.findAll();
//        System.out.println(bookList);

        // 测试批量添加
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3", "java", "java"};
        Object[] o2 = {"4", "Vue", "Vue"};
        Object[] o3 = {"5", "python", "python"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }
}
