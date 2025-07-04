package com.example.library;

public class BookRepository {
    public void save(Book book) {
        System.out.println("Saving book: " + book.getTitle());
    }
}
