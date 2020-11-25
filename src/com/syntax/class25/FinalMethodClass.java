package com.syntax.class25;

public class FinalMethodClass {

    final double PI=3.14;

    void calculateAreaOfCircle(double raduis){

        System.out.println("Area of the circle "+PI*raduis*raduis);
    }

    double add(double num1, double num2){
        return num1+num2;
    }

    final public void printName(){
        System.out.println("Hello world");
    }
}
