package com.syntax.class11GroupProject;

public class GroupTask5 {

	public static void main(String[] args) {
		// 5. Write a java program to find the second largest number in the array?

		int temp;

		int[] array = { 25, 3, 0, 12, -11, 88, 65 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		System.out.println("Second largest number is " + array[array.length - 2]);

	}

}
