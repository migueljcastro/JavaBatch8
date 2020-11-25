package com.syntax.class16;

public class Main {
    public static void main(String[] args) {

        //VoidMethods.print();
        //VoidMethods.print("Miguel");
        //Task1.printLarger(10,20);
        //Task1.printLarger(100.5, 20.5);
        //Task1.printLarger(10, 10);

        //if we don't use methods
       /* double number1=10;
        double number2=20;
        if(number1>number2){
            System.out.println(number1+" is larger");
        }else if(number2>number1){
            System.out.println(number2+" is larger");
        }else{
            System.out.println("Numbers are equals");
        }

        number1 = 100.5;
        number2 = 20.5;
        if(number1>number2){
            System.out.println(number1+" is larger");
        }else if(number2>number1){
            System.out.println(number2+" is larger");
        }else{
            System.out.println("Numbers are equals");
        }

        number1 = 10;
        number2 = 10;
        if(number1>number2){
            System.out.println(number1+" is larger");
        }else if(number2>number1){
            System.out.println(number2+" is larger");
        }else{
            System.out.println("Numbers are equals");
        }*/

//        Task2 task2 = new Task2();
//        task2.printNumberEvenOrOdd(5);
//        task2.printNumberEvenOrOdd(2);
//        task2.printNumberEvenOrOdd(10);
//        task2.printNumberEvenOrOdd(1000);

        Task3 task3 = new Task3();
        task3.isStringPalindrome("aba");
        task3.isStringPalindrome("a");
        task3.isStringPalindrome("eabae");
        task3.isStringPalindrome("eabaf");
        task3.isStringPalindrome("Syntax");


    }
}
