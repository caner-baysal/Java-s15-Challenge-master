package com.workintech.library;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<Book> borrowedBooks;

    public Reader(String fullName) {
        super(fullName);
    }

    public List<Book> getBooks() {
        return borrowedBooks;
    }

    public void setBooksRead(List<Book> books) {
        this.borrowedBooks = books;
    }

    public boolean canBorrowMore() {
        return borrowedBooks.size() < 5;
    }

    public void purchaseBook(Book book) {
        if(canBorrowMore()) {
            borrowedBooks.add(book);
            book.setStatus(BookStatus.valueOf(String.valueOf(BookStatus.BORROWED)));
        } else {
            System.out.println("Reader already has 5 books");
        }
    }

    public void borrowBook(Book book) {
        if(canBorrowMore()) {
            borrowedBooks.add(book);
            book.setStatus(BookStatus.valueOf(String.valueOf(BookStatus.BORROWED)));
        } else {
            System.out.println("Reader already have 5 books");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setStatus(BookStatus.valueOf(String.valueOf(BookStatus.AVAILABLE)));
    }

    public void showBook() {
        System.out.println(borrowedBooks);
    }


    @Override
    public void whoYouAre() {
        System.out.println("I am a reader"); ;
    }
}
