package com.syntax.class19;

public class Task3 {

    /*
        Write a program  that will have 4 different access levels of constructors and create 3 objects of this
         class:
         1 - inside same class;
         2 - from outside the class;
         3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    double salary;

    private Task3(String name){
        //I can only create objects of my class from the same class
        this.name = name;
    }
    Task3(int age){
        this.age = age;
    }
    public Task3(double salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        //Task3 task1 = new Task3(); // CE as now Java will not create the default constructor.
        Task3 task1 = new Task3("Miguel");
        System.out.println(task1.name);
        System.out.println("Private constructor is called ");


        Task3 task2 = new Task3(12);
        System.out.println(task2.age);
        System.out.println("Default constructor is called ");


        Task3 task3 = new Task3(1000.0);
        System.out.println(task3.salary);
        System.out.println("Public constructor is called ");
    }
}
