package com.workintech.library;


import java.util.Date;
import java.util.Objects;

public class Book {
    private int bookId;
    private String title;
    private double price;
    private boolean available = true;
    private Author author;
    private Category category;
    private BookStatus status;

    public Book(int bookId, String title, double price, Author author, Category category, BookStatus status) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    public int getId() {
        return bookId;
    }

    public void setId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", author=" + author +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Double.compare(price, book.price) == 0 && available == book.available && Objects.equals(title, book.title) && Objects.equals(author, book.author) && category == book.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, available, author, category);
    }


}
