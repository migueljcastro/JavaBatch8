package com.syntax.class15;

public class Task2 {
    public static void main(String[] args) {
        /* 1. Create a String and if the String is not empty perform the following:
              if the String has an odd number of characters and has 3 or more characters,
              print the character in the middle of the String.
           2. Create a String and print it in reverse order (Sunday → yadnuS).
         */
        System.out.println(7/2);
        String string = "String";
        int length = string.length();
        if(!string.isEmpty()){
            if(length>=3 && length%2!=0){
                System.out.println(string.charAt(length/2));


            }
        }
    }
}
