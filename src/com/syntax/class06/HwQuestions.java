package com.syntax.class06;

import java.util.Scanner;

public class HwQuestions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loan =true;
		int score;
		String eli=null;
		System.out.println("Do you need a loan?");		
				loan = input.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			score = input.nextInt();
			if (score < 600) {
				eli = "Not eligible";
			} else if (score >= 600 && score < 700) {
				eli = "Maybe eligible";
			} else if (score >= 701 && score < 800) {
				eli = "Eligible";
			} else if (score > 800) {
				eli = "Definitely eligible";
			}
		} else {
			eli = "Unknown";
		}
		System.out.println("The eligibility is " +eli);
	}
}
