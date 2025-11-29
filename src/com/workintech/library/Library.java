package com.workintech.library;

import java.util.*;

public class Library {
    List<Reader> readers;
    List<Book> books;
    Map<Book, Reader> lendedBooks;

    public Library(List<Reader> readers, List<Book> books, Map<Book, Reader> lendedBooks) {
        this.readers = readers;
        this.books = books;
        this.lendedBooks = lendedBooks;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<Book, Reader> getLendedBooks() {
        return lendedBooks;
    }

    public void setLendedBooks(Map<Book, Reader> lendedBooks) {
        this.lendedBooks = lendedBooks;
    }

    public void addBook(Book book) {
        if(!books.contains(book)) {
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void findBook(Book book) {
        book.getId();
    }

    public void lendBook(Reader reader, Book book) {
        if(books.contains(book)) {
            lendedBooks.put(book, reader);
            removeBook(book);
        }
    }

    public void returnBook(Book book) {
        addBook(book);
    }

    @Override
    public String toString() {
        return "readers= " + readers + " books=" + books + " lendedBooks=" + lendedBooks;
    }
}
