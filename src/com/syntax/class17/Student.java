package com.syntax.class17;

public class Student {

    String name;
    int age;
    double marks;
    static int numberOfStudentsEnrolled;

    public void printInfo() {
        int number=12;
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }
    public void printMarks(){
        System.out.println(" Marks "+ marks);

    }

    public void StudentsRegistered() {
        System.out.println("Number of Students up until now" + numberOfStudentsEnrolled);
    }
}
