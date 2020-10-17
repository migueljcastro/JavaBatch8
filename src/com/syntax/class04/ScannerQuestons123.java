package com.syntax.class04;

import java.util.Scanner;

public class ScannerQuestons123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		String Gender;
		Gender = input.nextLine();
		
		
		
		System.out.println("Please enter your age");
		int age = input.nextInt();
		
		if(Gender.equals("M")) {
			if(age>=25)
			System.out.println("Man");
		}
		else {
			System.out.println("Woman");
		} 
	
		
			
			
		
		
	}

}
