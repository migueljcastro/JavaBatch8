package com.syntax.class11GroupProject;

public class GroupTask4 {

	public static void main(String[] args) {
		int[] array = {25, 3, 0, 12, -11, 88, 65};
		
		
		int max = array[0];
		int min = array[0];
		
		
		for (int i = 1; i < array.length; i++) {
			//Max
			if (array[i] > max) {
				max = array[i];
			}
			
			
		}
		
		for (int i = 1; i < array.length; i++) {
			//Min
			if (array[i] < min) {
				min = array[i];
			}
			
			
		}
		
		System.out.println("The largest number from an array is " + max);

		System.out.println("The smallest number is: " + min);

	}

}
