package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		//Task 1
		System.out.println("Print numbers from 1 to 50 except those that are divisible by 3");
		for(int i = 1; i <=50; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		//Task 2
		System.out.println();
		/*Create a program that will keep asking user to apply for credit card.
		 * as soon as you get "yes" from a user, program should stop asking.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		String response;
		
		do {
			
			System.out.println("Do you want to appluy for a credit card?");
			response = input.nextLine();
			
		}while (!response.equalsIgnoreCase("yes"));
			
		System.out.println("You are selected");
	}

}
