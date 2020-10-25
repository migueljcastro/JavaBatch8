package com.syntax.class11GroupProject;

public class GroupTask3 {

	public static void main(String[] args) {
		int num = 10;
		int num1 = 0;
		int num2 = 1;

		System.out.println(" the first " + num + " of Fibonacci seq: ");

		for (int i = 1; i <= num; i++) {

			System.out.print(num1 + " + ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;

		}

	}

}
