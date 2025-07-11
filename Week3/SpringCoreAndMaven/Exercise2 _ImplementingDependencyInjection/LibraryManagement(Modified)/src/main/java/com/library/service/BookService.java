package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    public void setBookRepository(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }
    public void printBookTitle(int id) {
        String title = bookRepo.getBookTitleById(id);
        System.out.println("Retrieved Book Title for id " + id + ": " + title);
    }


}
