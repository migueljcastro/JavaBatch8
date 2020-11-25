package com.syntax.class15;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


       /*
        1. How would you reverse a String character by character?
       */

        String input = "Miguel Castro";

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        StringBuilder stringBuilder=new StringBuilder("Miguel J Castro");
        System.out.println(stringBuilder.reverse());







    /*
        3. How would you check if String is palindrome or not?
     */
    /*
        4. How would you swap  2 strings without a temporary variable?
     */
    }
}
