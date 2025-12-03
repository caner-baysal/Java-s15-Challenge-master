package com.workintech.library;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class Author extends Person{

    private List<Book> booksWritten = new LinkedList<>();

    public Author(String fullName) {
        super(fullName);
        this.booksWritten = new LinkedList<>();
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am an author");
    }


    public List<Book> getBooks() {
        return booksWritten;
    }

    public void setBooks(List<Book> books) {
        this.booksWritten = books;
    }

    public void newBook(String name, Author author) {
        booksWritten.add(new Book(name, author));
    }

    public void showBook() {
        System.out.println(booksWritten);
    }


    @Override
    public String toString() {
        return super.toString() + " book list: " + this.booksWritten;
    }
}
