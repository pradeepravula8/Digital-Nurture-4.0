package com.example.library.controller;

import com.example.library.service.BookService;

public class LibraryController {
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void addBook(String title) {
        System.out.println("[Controller] Adding book: " + title);
        bookService.saveBook(title);
    }
}
