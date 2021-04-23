package com.lixinzhuang.service;

import com.lixinzhuang.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    // 增加一本书
    int addBook(Book book);
    // 删除
    int deleteBookById(int id);
    // 更新
    int updateBook(Book book);
    // 查询一本
    Book queryBookById(int id);
    // 查询所有
    List<Book> queryAllBook();
}
