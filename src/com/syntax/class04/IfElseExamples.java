package com.syntax.class04;

public class IfElseExamples {

	public static void main(String[] args) {

		System.out.println("-----------EXAMPLE4------------");

		boolean diploma = true;
		double gpa = 3.5;

		if (diploma) {

			System.out.println("Congradulations");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else if (gpa < 3.5) {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree!");
		}

		System.out.println("-----------EXAMPLE5------------");

		double mRate = 4.5;
		int mPrice = 150000;

		if (mRate > 4.5) {
			System.out.println("I will not buy a house");

		} else {

			System.out.println("I am thinking about buying a house");

			if (mPrice >= 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay cash");
			}
		}

	}

}
