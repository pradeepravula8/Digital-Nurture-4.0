package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(String title) {
        System.out.println("[Service] Processing book: " + title);
        bookRepository.save(title);
    }
}
