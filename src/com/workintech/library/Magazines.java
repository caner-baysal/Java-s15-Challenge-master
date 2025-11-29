package com.workintech.library;

import java.util.Date;

public class Magazines extends Book{
    private String category;

    public Magazines(int id, String name, double price, boolean status, double edition, Date dateOfPurchase, Author author, String category) {
        super(id, name, price, String.valueOf(status), edition, dateOfPurchase, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + "category: " + this.category;
    }
}
