package com.syntax.class29;

public class Student implements PrintInfo, PayFee {
    @Override
    public void printName() {
        System.out.println("Miguel");
    }

    @Override
    public void printPhoneNumber() {
        System.out.println("987654321");
    }

    @Override
    public void printAddress() {
        System.out.println("blah blah blah blah blah");
    }

    @Override
    public void payFee() {
        System.out.println("Paid bill");
    }
}
