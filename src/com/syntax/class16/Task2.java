package com.syntax.class16;

public class Task2 {
    /*
        Create a method that will take a number and print whether the number is even or odd.
     */
    //Even numbers 2,4,6,8,10,12.... if a number is completely divisible by 2 it is an Even number
    //If numbers are not divisible by 2 they treated as Odd numbers 1,3,5,7.....
        void printNumberEvenOrOdd(int number){
            if(number%2==0){
                System.out.println("Number is an Even number");
            }else{
                System.out.println("Number is an Odd number");
            }
        }
}
