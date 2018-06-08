package com.robert.service;

import com.robert.dao.AuthorDAO;
import com.robert.dao.BookDAO;
import com.robert.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;
    @Autowired
    private AuthorDAO autorDAO;

    public void createBook(Book book) {
        book.getAuthors().addAll(autorDAO.findAll());
        bookDAO.create(book);
    }

}
