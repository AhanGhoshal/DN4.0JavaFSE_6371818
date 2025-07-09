package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println("Enter Book ID: ");
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        bookService.printBookTitle(id);
    }
}
