package com.syntax.class17;

public class Main {
    public static void main(String[] args) {


        /*Variables variables = new Variables();
        variables.varsDemo();
        variables.varsDemo1();*/

        Student miguel = new Student();
        miguel.name="Miguel";
        miguel.age=30;
        miguel.marks=90;
        Student.numberOfStudentsEnrolled++;
        miguel.StudentsRegistered();
        miguel.printInfo();


        Student juan = new Student();
        juan.name="Juan";
        juan.age=30;
        juan.marks=95;
        Student.numberOfStudentsEnrolled++;
        juan.StudentsRegistered();


        Student danny = new Student();
        danny.name="Danny";
        danny.age=34;
        danny.marks=98;
        Student.numberOfStudentsEnrolled++;
        danny.StudentsRegistered();


    }
}
