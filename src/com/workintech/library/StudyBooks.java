package com.workintech.library;

import java.util.Date;

public class StudyBooks extends Book{

    private String subject;

    public StudyBooks(int id, String name, double price, boolean status, double edition, Date dateOfPurchase, Author author, String subject) {
        super(id, name, price, status, edition, dateOfPurchase, author);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + "subject: " + this.subject;
    }
}
