package com.syntax.class16;

public class Task4 {
    /*
        Create a method that will say Hello in a different language
        based on the country that will passed when method is executed.
     */

    static void sayHello(String countryName){

        switch(countryName){

            case"USA":
                System.out.println("Hollo");
                break;
            case"China":
                System.out.println("Ni Hao");
                break;
            case"Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Country not supported");

        }

    }
}
