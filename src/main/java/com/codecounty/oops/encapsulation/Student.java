package com.codecounty.oops.encapsulation;

public class Student {

    private int roll;
    private String name;
    String collegeName;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    Student(int roll, String name, String collegeName) {
        this.roll = roll;
        this.name = name;
        this.collegeName=collegeName;

    }

    public String info() {
        return "Student{" +           //right click and generate code
                "Roll=" + roll +
                ", Name=" + name + ", CLG=" + collegeName +
                '}';
    }
}