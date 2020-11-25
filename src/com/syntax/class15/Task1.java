package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        Write a program that reads two people's first
	    names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
        */

        Scanner scan = new Scanner(System.in);
        String momsName, dadsName, gender, babyName;

        System.out.println("Please enter mothers name");
        momsName = scan.nextLine();
        System.out.println("Please enter dads name");
        dadsName = scan.nextLine();
        System.out.println("Is it a boy or a girl");
        gender = scan.nextLine();

        if (gender.toLowerCase().startsWith("b")) {
            String first = dadsName.substring(0, dadsName.length() / 2);
            String last = momsName.substring(momsName.length() / 2);
            babyName = first + last;

        } else if (gender.toLowerCase().startsWith("g")) {

        } else {
            babyName = "No suggestion";

        }


    }

}

