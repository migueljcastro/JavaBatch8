package com.syntax.class14;

public class LengthMethod {
    public static void main(String[] args){
        String name="Miguel";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Miguel Castro";
        System.out.println(name.length());
        name="   Miguel    ";//counts spaces included in your code for length method
        System.out.println(name.length());

        if(name.length()>10){
            System.out.println("you are great");
        }

    }
}
