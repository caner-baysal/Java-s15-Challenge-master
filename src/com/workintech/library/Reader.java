package com.workintech.library;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<Book> borrowedBooks;

    public Reader(int id, String fullName, List<Book> borrowedBooks, Book book) {
        super(id, fullName);
        this.borrowedBooks = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        return borrowedBooks;
    }

    public void setBooksRead(List<Book> books) {
        this.borrowedBooks = books;
    }

    public void purchaseBook(Book book) {
        if(borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
            book.setStatus(String.valueOf(BookStatus.BORROWED));
        } else {
            System.out.println("Reader already has 5 books");
        }
    }

    public void borrowBook(Book book) {
        if(borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
            book.setStatus(String.valueOf(BookStatus.BORROWED));
        } else {
            System.out.println("Reader already have 5 books");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setStatus(String.valueOf(BookStatus.AVAILABLE));
    }

    public void showBook(Book book) {
        System.out.println(book);
    }


    @Override
    public void whoYouAre() {
        System.out.println("I am a reader"); ;
    }
}
