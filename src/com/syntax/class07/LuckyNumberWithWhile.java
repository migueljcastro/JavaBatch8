package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		// play the lottery where we need to enter numbers from 1 to 100
		// lucky number is 7
		// keep asking user to enter a number until entered number is the same as the
		// lucky number
		
		Scanner input;
		int numberFromUser;

		int luckyNumber = 7;

		input = new Scanner(System.in);
		System.out.println("Please enter any number from 1 to 100");
		numberFromUser = input.nextInt();
		
		while(numberFromUser!=luckyNumber) {
			System.out.println("Please enter any number from 1 to 100");
			numberFromUser = input.nextInt();
		}


	}

}
