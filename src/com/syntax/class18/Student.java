package com.syntax.class18;

public class Student {
    /*
       2. Create a Class called Students
        Create three  variables  studentName , studentID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
     */
        String studentName;
        int studentID;
        static int numberOfStudents;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentID=123456;
        student1.studentName="Miguel";
        Student.numberOfStudents++;

        System.out.println(student1.studentID);
        System.out.println(student1.studentName);
        System.out.println(Student.numberOfStudents);

        Student student2 = new Student();
        student2.studentID=1234567;
        student2.studentName="Juan";
        Student.numberOfStudents++;

        System.out.println(student2.studentID);
        System.out.println(student2.studentName);
        System.out.println(Student.numberOfStudents);
    }
}
