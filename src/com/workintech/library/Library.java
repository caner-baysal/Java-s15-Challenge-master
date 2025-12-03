package com.workintech.library;

import java.util.*;

public class Library {
    private List<Reader> readers;
    private List<Book> books;
    private Map<String, Reader> lendedBooks;

    public Library() {
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
        this.lendedBooks = new HashMap<>();
    }


    public void addReader(Reader reader) {
        readers.add(reader);
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

    public Map<String, Reader> getLendedBooks() {
        return lendedBooks;
    }

    public void setLendedBooks(Map<String, Reader> lendedBooks) {
        this.lendedBooks = lendedBooks;
    }

    public void addBook(Book book) {
        if(!books.contains(book)) {
            books.add(book);
        }
    }

    public boolean removeBook(String book) {
        books.remove(book);
        return false;
    }

    public Book findBookById(Book book) {
        for(Book currentBook : books) {
            if(currentBook.getId() == book.getId()) {
                return currentBook;
            } else {
                System.out.println("Book not found");
            }
        }
        return book;
    }

    public Book findBookByTitle(String bookName) {
        for(Book currentBook : books) {
            if(currentBook.getTitle().equals(bookName)) {
                return currentBook;
            } else {
                System.out.println("Book not found");
            }
        }
        return null;
    }

    public Book findBookByAuthor(Book book) {
        for(Book currentBook : books) {
            if(currentBook.getAuthor().equals(book.getAuthor())) {
                return currentBook;
            } else {
                System.out.println("Book not found");
            }
        }
        return book;
    }

    public boolean lendBook(Reader reader, String book) {
        if(books.contains(book)) {
            lendedBooks.put(String.valueOf(book), reader);
            removeBook(book);
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        Book book = findBookByTitle(bookName);
        for(Book lendedBook : books) {
            if(Boolean.parseBoolean(lendedBook.getTitle())) {
                books.add(lendedBook);
            }
        }
        return false;
    }

    public List<Book> getBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public List<Book> getBooksByAuthor(Category category) {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
    }

    @Override
    public String toString() {
        return "readers= " + readers + " books=" + books + " lendedBooks=" + lendedBooks;
    }

}
