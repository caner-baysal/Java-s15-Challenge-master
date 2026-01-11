package com.workintech.library;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Author extends Person{

    private Set<Book> booksWritten = new HashSet<>();

    public Author(String fullName) {
        super(fullName);
        this.booksWritten = new HashSet<>();
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am an author");
    }


    public Set<Book> getBooks() {
        return new HashSet<>(booksWritten);
    }

    public void setBooks(Set<Book> books) {
        if(books == null) {
            this.booksWritten = new HashSet<>();
        } else {
            this.booksWritten = new HashSet<>(books);
        }
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
