package com.example.library.repository;

public class BookRepository {
    public void save(String title) {
        System.out.println("[Repository] Book '" + title + "' saved to database.");
    }
}
