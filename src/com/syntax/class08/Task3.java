package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range print the sum of the even odd
		 * integers
		 * 
		 */
		// Task 3
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a start range of numbers");
		int start = input.nextInt();
		System.out.println("Please enter a end range of numbers");
		int end = input.nextInt();
		int sumE = 0;
		int sumO = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumE += i;
			}
			if (i % 2 != 0) {
				sumO += i;
			}
		}
		System.out.println("The sum of even number from start to end that you entered is " + sumE);
		System.out.println("The sum of odd numbers from start to end that you entered is " + sumO);
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		// Task 4
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 * 
		 */
		String item;
		double price;
		double money;
		System.out.println("Enter item you want to buy");
		item = input.next();
		System.out.println("Enter items price");
		price = input.nextDouble();
		System.out.println("How much do you want to pay for?");
		money = input.nextDouble();

		while (item != null) {
			if (money > price) {
				double change = money - price;
				System.out.println("Thank you for the pruchase, your change is " + change);
				break;
			} else if (money < price) {
				double diff = price - money;
				System.out.println("Not enough paid, please add " + diff + " to make a purchase");
				break;
			} else {
				System.out.println("The amount is just right, transaction processing");
				break;
			}

		}
		System.out.println("Thank you for shopping!");
	}

}
