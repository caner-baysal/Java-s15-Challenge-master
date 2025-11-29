package com.workintech.library;

import java.util.Date;

public class Journals extends Book{
    private String department;

    public Journals(int id, String name, double price, boolean status, double edition, Date dateOfPurchase, Author author, String department) {
        super(id, name, price, status, edition, dateOfPurchase, author);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "department: " + department;
    }
}
