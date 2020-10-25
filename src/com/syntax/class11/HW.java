package com.syntax.class11;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array
		 */

		String[] animals = { "Lion", "Tiger", "Panther", "Gorilla", "Cheeta", "Ligar" };

		for (int i = 1; i < animals.length; i++) {
			System.out.println(animals[i] + " ");
		}

		System.out.println();
		System.out.println("----------------------------------------------");

		for (String anml_name : animals) {
			System.out.println(anml_name + " ");
		}
	}

}
