package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 6; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int r1 = 1; r1 <= 6; r1++) {
			for (int c1 = 1; c1 <= 12; c1++) {
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("------------- SQUARE of numbers -------------- ");

		for (int row = 1; row <= 4; row++) {
			for (int col = 3; col <= 10; col++) {
				System.out.print(row);
			}

			System.out.println();
		}

		System.out.println("------------------------------------------------");

		for (int row = 7; row >= 1; row--) {
			for (int col = 6; col >= 1; col--) {
				System.out.print(row);
			}

			System.out.println();
		}

		System.out.println("-----------------------------------------------");

		for (int row = 5; row >= 1; row--) {
			for (int col = 7; col >= 1; col--) {
				System.out.print(col);
			}

			System.out.println();
		}

	}

}
