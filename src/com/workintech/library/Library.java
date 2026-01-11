package com.workintech.library;

import java.util.*;

public class Library {
    private List<Reader> readers;
    private Set<Book> books;
    private Map<Book, Reader> lendedBooks;

    public Library() {
        this.readers = new ArrayList<>();
        this.books = new HashSet<>();
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

    public Set<Book> getBooks() {
        return new HashSet<>(books);
    }

    public void setBooks(List<Book> books) {
        this.books = new HashSet<>(books);
    }

    public Map<Book, Reader> getLendedBooks() {
        return new HashMap<>(lendedBooks);
    }

    public void setLendedBooks(Map<Book, Reader> lendedBooks) {
        this.lendedBooks = new HashMap<>(lendedBooks);
    }

    public void addBook(Book book) {
        if(!books.contains(book)) {
            books.add(book);
        }
    }

    public boolean removeBook(String bookTitle) {
        Book bookToRemove = findBookByTitle(bookTitle);
        if(bookToRemove != null) {
            books.remove(bookToRemove);
            return true;
        } else {
            return false;
        }
    }

    public Book findBookById(int id) {
        for(Book currentBook : books) {
            if(currentBook.getId() == id) {
                return currentBook;
            } else {
                System.out.println("Book not found");
            }
        }
        return null;
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

    public Set<Book> findBookByAuthor(String authorName) {
        Set<Book> result = new HashSet<>();
        if (authorName == null) return result;
        for (Book current : books) {
            if (authorName.equals(current.getAuthor().getFullName())) {
                result.add(current);
            }
        }
        return result;
    }

    public Set<Book> listAvailableBooks() {
        Set<Book> available = new HashSet<>();
        for (Book current : books) {
            if (current.isAvailable()) {
                available.add(current);
            }
        }
        return available;
    }

    public boolean lendBook(Reader reader, String bookTitle) {
        Book bookToLend = findBookByTitle(bookTitle);
        if (reader == null || bookToLend == null) return false;
        if (books.contains(bookToLend) && !lendedBooks.containsKey(bookToLend) && reader.canBorrowMore()) {
            lendedBooks.put(bookToLend, reader);
            books.remove(bookToLend);
            //Invoice should be created here
            return true;
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

    public List<Book> getBooksByCategory(Category category) {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory().equals(category)) {
                booksByCategory.add(book);
            }
        }
        return booksByCategory;
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

    public void updateBook(Book updatedBook) {
        for(Book book : books) {
            if(book.getId() == updatedBook.getId()) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
            }
        }
    }

    @Override
    public String toString() {
        return "readers= " + readers + " books=" + books + " lendedBooks=" + lendedBooks;
    }

}
