package com.syntax.class19;

public class Task4 {
    /*
        Write a program that has a static constructor and observe result.
     */
    String name;
    String address;
    Task4(String name,String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.print("Name "+ name);
        System.out.println("address "+address);
    }
    public static void main(String[] args) {
        Task4 studentA= new Task4("Miguel","115 Deer Park");
        studentA.displayInfo();
        Task4 studentB= new Task4("Javier","123 Mo Road ");
        studentB .displayInfo();
    }
}