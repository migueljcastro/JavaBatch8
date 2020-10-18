package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * 
		 * print numbers from 100 to 1
		 * 
		 * Print even numbers from 20 - 1 (2 ways)
		 * 
		 * Print odd numbers between 20 and 50 (2 ways)
		 * 
		 */

		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Print numbers from 100 to 1");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Print even numbers from 20 to 1 (1st way)");
		// 1st way
		for (int i = 20; i >= 1; i--)
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		// 2nd way
		System.out.println();
		System.out.println("Print even numbers from 20 to 1 (2nd way)");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 1st way
		System.out.println("Print odd numbers from 20 to 50 (1st way)");
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 2nd way
		System.out.println("Print odd numbers from 20 to 50 (2nd way) ");
		for (int i = 50; i >= 20; i--) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// Calculate sum of even and odd numbers from range 1 to 50
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i < 51; i++) {
			if (i % 2 == 0) {
				sumEven = i + sumEven;
				// or sumEven+= i;
			}
			if (i % 2 == 1) {
				sumOdd = i + sumOdd;
				// or sumOdd+= i;

			}
		}
		System.out.println("The sum of even numbers from 50 to 1 is " + sumEven);
		System.out.println("The sum of odd numbers from 50 to 1 is " + sumOdd);

		System.out.println("-----------------------------------------------------------");
		// I want to create a multiplication table
		/*
		 * 1x1=1 1x2=2 1x3=3 ect..
		 * 
		 * 
		 * 1x10=10
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter which number you want to miltiply with");
		int num1 = scan.nextInt();
		int mult;

		for (int i = 1; i <= 10; i++) {

			mult = num1 * i;
			System.out.println(num1 + "x" + i + " = " + mult);
		}

	}

}
