package com.workintech.library;


import java.util.Date;
import java.util.Objects;

public class Book implements Assignable {
    private int bookId;
    private String name;
    private double price;
    private String status;
    private double edition;
    private Date dateOfPurchase;
    private Author author;

    public Book(int bookId, String name, double price, String status, double edition, Date dateOfPurchase, Author author) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.author = author;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }
    public int getId() {
        return bookId;
    }

    public void setId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getEdition() {
        return edition;
    }

    public void setEdition(double edition) {
        this.edition = edition;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }


    @Override
    public String toString() {
        return "id=" + this.bookId +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                ", status=" + this.status +
                ", edition=" + this.edition +
                ", dateOfPurchase=" + this.dateOfPurchase;
    }

    @Override
    public void getTitle() {

    }

    @Override
    public void getAuthor() {

    }

    @Override
    public void changeOwner() {

    }

    @Override
    public void getOwner() {

    }

    @Override
    public void display() {

    }

    @Override
    public void updateStatus() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookId);
    }
}
