package com.syntax.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 2. Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */

		double num1, num2, num3, max;
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		input.close();
		// 1st way
		
		//if(num1 !=num2 && num2 !=3){
		//if(! (num1 == num2 && num2 == num3)){ 
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
		
		System.out.println("-------------2nd way nested if--------------");
		
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println(max);
	}

	}


