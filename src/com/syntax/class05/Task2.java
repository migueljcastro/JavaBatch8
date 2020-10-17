package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input; 
		input= new Scanner(System.in);
		int years;
		int salary;
		
		System.out.println("Enter number of years worked and annual salary");
		years = input.nextInt();
		salary = input.nextInt();
		
		if(years>=5) {
			System.out.println("User is eligible for a bonus");
			if(salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
		}else {
			System.out.println("You are not eligible for bonus");
		}
		

	}

}
