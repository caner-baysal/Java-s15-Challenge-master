package com.workintech.library;

import java.util.List;

public class Librarian extends Person{
    private String username;
    private String password;
    private List<Book> allBooks;


    public Librarian(int id, String fullName, String username, String password, List allBooks) {
        super(id, fullName);
        this.username = username;
        this.password = password;
        this.allBooks = allBooks;
    }

    public void addBook(Book book) {
        if(!allBooks.contains(book)) {
            allBooks.add(book);
            System.out.println("Book added");
        }
    }

    public void findById(Book book) {
        if(allBooks.contains(book)) {
            System.out.println("Book found");
        } else {
            System.out.println("Book not found");
        }
    }

    @Override
    public void whoYouAre() {
        System.out.println("I am the librarian");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> allBooks) {
        this.allBooks = allBooks;
    }
}
