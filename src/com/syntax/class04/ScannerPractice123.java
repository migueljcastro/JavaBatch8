package com.syntax.class04;

import java.util.Scanner;

public class ScannerPractice123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Is it sunny out?");
		boolean isSunny = input.nextBoolean();
		
		if(isSunny) {
			System.out.println("It is sunny day, I should go somewhere!");
			System.out.println("What is the temperature?");
			int temp = input.nextInt();
			
			if(temp>85) {
				System.out.println("I am going to the beach!");
			}else {
				System.out.println("I am going to the park!");
			}}
			
		else {
			System.out.println("I stay home and practice Java!");
		}
		
		
		
			
		
	}

}
