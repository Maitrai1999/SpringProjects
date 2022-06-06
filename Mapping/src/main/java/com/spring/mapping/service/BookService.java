package com.spring.mapping.service;

import org.springframework.stereotype.Component;

import com.spring.entity.Book;

@Component
public interface BookService {
    public Book saveBook(Book book);
    public Book findByBookId(int bookId);
}
