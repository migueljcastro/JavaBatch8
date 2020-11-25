package com.syntax.class16;

public class HwTask2 {
    /*
        2. Write a method to return whether given number is a prime or not?
        What is a prime number?
     */

    boolean isPrime(int number){

        if(number<=1){
            return false;
        }
        boolean isPrime=true;
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
