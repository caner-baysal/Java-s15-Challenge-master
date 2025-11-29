package com.workintech.library;

import java.sql.SQLOutput;

public class Invoice {
    private Reader reader;
    private Book book;
    private double amount;
    private boolean isRefunded;

    public Invoice(Reader reader, Book book, double amount, boolean isRefunded) {
        this.reader = reader;
        this.book = book;
        this.amount = amount;
        this.isRefunded = isRefunded;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("----INVOICE----");
        System.out.println("Reader: " + reader.getFullName());
        System.out.println("Book: " + book.getName());
        System.out.println("Amount: " + amount);
        System.out.println("Book has been issued.");
        System.out.println("The reader will have to pay daily fine, if the book is not delivered back until the deadline.");
    }

    public void refund() {
        this.isRefunded = true;
        System.out.println(amount + " is refunded.");
    }
}
