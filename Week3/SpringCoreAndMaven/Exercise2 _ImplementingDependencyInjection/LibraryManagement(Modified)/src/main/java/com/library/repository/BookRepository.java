package com.library.repository;

public class BookRepository {
    public String getBookTitleById(int id) {
        if (id==1)
            return "Book1";
        else if (id==2)
            return "Book2";
        else
            return "Book3";
    }
}
