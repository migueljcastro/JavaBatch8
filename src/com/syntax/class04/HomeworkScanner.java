package com.syntax.class04;

import java.util.Scanner;

public class HomeworkScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your gender: M or F");
		char gender=input.next().charAt(0);
		
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if(gender=='F') {
			if(age<25) {
				System.out.println("Girl");
			}else {
				System.out.println("Woman");
				}
		} if(gender=='M'){
			if(age<25) {
				System.out.println("boy");
			}
			else {
				System.out.println("Man");
			}
			
		}
		

	}

}


