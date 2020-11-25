package com.syntax.class16;

import javax.swing.*;

public class HwTask3 {
    /* 3. Create  class Student that will have a method getGrade.
          Your method should accept the score of a student and return a grade:
          score > 90 - A
          score >80 - B
          score >70 - C
          score > 50 - D
          anything else - F
       */
    char getGrade(int marks) {
        char grade;
        if (marks >=90 && marks <= 100) {
            grade = 'A';
        } else if (marks >=80 && marks<90) {
            grade = 'B';
        } else if (marks >=70 && marks <80) {
            grade = 'C';
        } else if (marks >=60 && marks <70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        HwTask3 hwtask3= new HwTask3();
        System.out.println(" hwtask.getGrade(90) "+ hwtask3.getGrade(90));
    }

}
