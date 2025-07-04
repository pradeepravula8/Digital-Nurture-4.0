package com.example.library;

public class BookService {

    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor Injection: BookRepository injected.");
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter Injection: BookRepository injected.");
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        Book book = new Book(title);
        bookRepository.save(book);
    }
}
