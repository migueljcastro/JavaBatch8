package com.syntax.class11;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capitals for each country.
		 */

		String[] countries = { "USA", "Ukraine", "Canada" };
		String[] capitals = { "DC", "Kyiv", "Ottawa" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
		}
		System.out.println("---------------------------------------------");

		String capital;

		for (String country : countries) {

			switch (country) {
			case "USA":
				capital = "DC";
				break;
			case "Ukraine":
				capital = "Kiev";
				break;
			case "canada":
				capital = "Ottawa";
				break;
			default:
				capital = "I do not know";
			}

			System.out.println("Capital of the " + country + " is " + capital);
		}
	}

}
