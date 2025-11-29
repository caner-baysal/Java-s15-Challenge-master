package com.workintech.library;

public class Student extends Person{
    private int studentId;

    public Student(int id, String fullName, int studentId) {
        super(id, fullName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public void whoYouAre() {
        System.out.println("I am a student");
    }

    @Override
    public String toString() {
        return super.toString() + " Student ID: " + this.studentId;
    }
}
