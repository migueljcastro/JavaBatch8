package com.syntax.class22;

public class Task4 {
    /*
        4. Create 1 class in which create a method that will calculate the area of
            Rectangle
            Square
            Use separate class to test your code
     */

    double getArea(double length){
        return length*length;
    }

    double getArea(double height, double width){
        return height*width;
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println("Area of a square "+ task4.getArea(10));
        System.out.println("Area of a rectangle "+task4.getArea(10, 20));
    }
}
