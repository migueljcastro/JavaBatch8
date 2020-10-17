package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has credit card or not. If your
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is the balance on the card? If balance of the card is larger than 1000,
		 * tell them to pay off immediately, otherwise you can tell them that they can
		 * spend more.
		 */

		Scanner scan;// declaring
		boolean answer;
		//change boolean value String value
		double balance;

		scan = new Scanner(System.in);// initializing
		System.out.println("Please enter if you have a credit (true/false)");

		answer = scan.nextBoolean();
		//or use, answer = scan.next()
		//with string use if("answer.equals("yes"))
		if (answer) {
			System.out.println("What is the balance on your card?");
			balance = scan.nextDouble();

			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more $$");
			}
		} else {
			System.out.println("Would you like to get a credit card?");
		}

		System.out.println("----------------OR-------------------------");
		
		Scanner scan1;// declaring
		String answer1;
		
		double balance1;

		scan1 = new Scanner(System.in);// initializing
		System.out.println("Please enter if you have a credit (true/false)");

		answer1 = scan1.next();
		
		if (answer1.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your card?");
			balance1 = scan1.nextDouble();

			if (balance1 > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more $$");
			}
		} else {
			System.out.println("Would you like to get a credit card?");
		}
		
		
	}

}
