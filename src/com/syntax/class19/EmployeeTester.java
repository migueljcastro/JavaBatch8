package com.syntax.class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees employee1 = new Employees();
        employee1.age=200;
        employee1.name="Juan";
        employee1.grade='M';
        System.out.println(employee1.age);
//-------------------------------------------------------------------------------------------------
        Employees employees2 = new Employees(5, "Gaby", 'A');
        System.out.println(employees2.age);
    }
}
