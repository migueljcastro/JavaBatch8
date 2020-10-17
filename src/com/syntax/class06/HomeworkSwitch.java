package com.syntax.class06;

import java.util.Scanner;

public class HomeworkSwitch {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		char grade;
		String message;
		System.out.println("Please enter your grade");
		grade = input.next().charAt(0);

		switch (grade) {

		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = "Not Acceptable";
			
			System.out.println("Your grade is "+message);
		
			
			
			/*
		 * 1. Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * 
		 * 
		 * 2. HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */

		}

	}

}
