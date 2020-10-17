package com.syntax.class06;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word1 = null;
		String word2 = null;
		int num1;
		int num2;
		
		System.out.println("Please enter two strings");
		word1 = input.next();
		word2 = input.next();
		
		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1==num2 && word1.equals(word2)) {
			System.out.println("AND");
		}else if(num1==num2 || word1.equals(word2)) {
			System.out.println("OR");
		}else if(num1!=num2 && (!word1.equals(word2))) {
			System.out.println("NONE");
		}
		
	}

}
