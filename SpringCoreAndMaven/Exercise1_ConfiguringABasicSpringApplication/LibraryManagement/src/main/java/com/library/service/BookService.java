package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    BookRepository bookRepo = new BookRepository();
    public void printBookTitle(int id) {
        String title = bookRepo.getBookTitleById(id);
        System.out.println("Retrieved Book Title for id " + id + ": " + title);
    }
}
