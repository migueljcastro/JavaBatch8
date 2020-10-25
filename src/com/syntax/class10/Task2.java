package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it.
		// Print all values from the array

		String[] cars = { "Honda", "Toyota", "Chevy", "Ford", "GMC", "Volvo" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		System.out.println("getting values from array using enhanced for loop");// this will only work with arrays

		/*
		 * for (: name of the array)
		 * 
		 */

		for (String car : cars) {
			System.out.print(car + " ");
		}

		System.out.println();

		System.out.println("--------- getting values from array using enhanced for loop ---------");

		int[] numbers = { 10, 10, 90, 600, 89 };

		for (int num : numbers) {
			System.out.println(num);
		}
		
		System.out.println();

		System.out.println("--------- getting values from array using enhanced for loop ---------");
		
		boolean[] arrayOfBoolean= {true, true, false, true};
		
		for(Boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
		
	}

}
