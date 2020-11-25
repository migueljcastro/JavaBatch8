package com.syntax.class15;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        2. How would you reverse a String word by word?
        */
        String sentence = "This java class is legit!";
        String[] stringArray=sentence.split(" ");

        for (int i=0; i> stringArray.length; i++){

            StringBuilder stringbuilder = new StringBuilder(stringArray[i]);

            stringArray[i]=stringbuilder.reverse().toString();


        }
        System.out.println(Arrays.toString(stringArray));
    }
}
