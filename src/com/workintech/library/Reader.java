package com.workintech.library;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String fullName) {
        super(fullName);
        if (this.borrowedBooks == null) {
            this.borrowedBooks = new ArrayList<>();
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    public void setBooksRead(List<Book> books) {
        if(books == null) {
            this.borrowedBooks = new ArrayList<>();
        } else {
            this.borrowedBooks = new ArrayList<>(books);
        }
    }

    public boolean canBorrowMore() {
        return borrowedBooks != null && borrowedBooks.size() < 5;
    }

    public void purchaseBook(Book book) {
        if(book == null) return;
        if(canBorrowMore()) {
            borrowedBooks.add(book);
            book.setStatus(BookStatus.BORROWED);
        } else {
            System.out.println("Reader already has 5 books");
        }
    }

    public void borrowBook(Book book) {
        if(book == null) return;
        if(canBorrowMore()) {
            borrowedBooks.add(book);
            book.setStatus(BookStatus.BORROWED);
        } else {
            System.out.println("Reader already have 5 books");
        }
    }

    public void returnBook(Book book) {
        if (book == null || borrowedBooks == null) return;
        boolean removed = borrowedBooks.remove(book);
        if (removed) {
            book.setStatus(BookStatus.AVAILABLE);
        }
    }

    public void showBook() {
        System.out.println(borrowedBooks);
    }


    @Override
    public void whoYouAre() {
        System.out.println("I am a reader"); ;
    }
}
