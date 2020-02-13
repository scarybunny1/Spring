package com.thinkxfactor.demoApp.entity;

import java.util.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Books{
    private String name;
    private String author;
    private int isbn;
    private String category;

    public Books(){
        System.out.println("Book created!");
    }

    public Books(String name, String author, int isbn, String category){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getISBN(){
        return isbn;
    }

    public String getCategory(){
        return category;
    }

    @GetMapping("/books")
    public ArrayList<Books> listOfBooks(){
        Books b1 = new Books("Java - The Complete Reference","Herbert Schild",1234,"Programming");
        Books b2 = new Books("Design and Analysis of Algorithms","Thomas H Cormen",1111,"Programming");
        Books b3 = new Books("Thinking Fast and Slow","Daniel Kahneman",01003,"Psychology");
        Books b4 = new Books("All the Light we Cannot See","Anthony Doerr",29472,"Fiction");
        ArrayList<Books> book_list = new ArrayList<Books>();
        book_list.add(b1);
        book_list.add(b2);
        book_list.add(b3);
        book_list.add(b4);
        return book_list;
        
    }
}