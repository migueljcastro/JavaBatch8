package com.syntax.class02;

public class ArithemeticPractice {

	public static void main(String[] args) {
		
		/* 1. Write a Java program to add, subtract, multiply, and divide 2 decimal values. 
		 * Your Program should say. "The ____ of 2 numbers  ____ and ____ is equal to ____"
		 */
		float num4;
		float num5;
		num4 = 9.99f;
		num5 = 2.99f;
		float add = num4+num5;
		float sub = num4-num5;
		float mutl = num4*num5;
		float div = num4/num5;
		
		System.out.println("The additon of 2 numbers " +num4+ " and " +num5+ " is equal to " +add);
		System.out.println("The subtraction of 2 numbers " +num5+ " and " +num4+ " is equal to " +sub);
		System.out.println("The Multiplication of 2 numbers " +num4+ " and "+num5+" is equal to " +mutl);
		System.out.println("The Division of 2 numbers " +num4+ " and " +num5+ " is equal to " +div);
		
		/* 2. Write a program to find the square of the number 3.9. Your program should say
		 * "The square of the ___ is ___. 
		 */
		
		double num1;
		num1 = 3.9;
		double square = num1*num1;
		
		System.out.println("The square of the number " +num1+ " is "+square);
		
		/* 3. Write a program to print the area and perimeter of a rectangle of a rectangle with = 5
		 * and height = 8. Your program should say " The perimeter of a rectangle with width ___ and height ___
		 * ___ is equal to ____ and the area is ___.  
		 */
		
		int w1 = 5;
		int h1 = 8;
		int P = 2 * (w1+h1);
		int A = w1*h1;
		
		System.out.println("The perimeter of a rectangle with width "+w1+ " and height "+h1+" is equal to "+P+" and the area is "+A);
		
				
		
	}

}
