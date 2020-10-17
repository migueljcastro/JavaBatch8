package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */

		Scanner input = new Scanner(System.in);
		int quiz;
		int midTerm;
		int finalScore;
		int avg;
		System.out.println("Enter your quiz score");
		quiz = input.nextInt();
		System.out.println("Please enter your mid term score");
		midTerm = input.nextInt();
		System.out.println("Please enter final score");
		finalScore = input.nextInt();

		avg = (quiz + midTerm + finalScore) / 3;
		
		if(avg>90) {
			System.out.println("Grade = A");
			System.out.println("you are a good student you are studying a lot");
		}else if(avg>=70 && avg<90) {
			System.out.println("Grade = B");
			System.out.println("you are a good student you are studying a lot");
		}else if(avg>=50 && avg<70) {
			System.out.println("Grade = C");
			System.out.println("Please Study more");
		}else if(avg>=40 && avg <50) {
			System.out.println("Grade = D");
			System.out.println("Please Study more");
		}else {
			System.out.println("Grade = F");
			System.out.println("Please study more");
		}
		
		//if your grade is A or B --> you are a good student you are studying a lot

		
		

	}

}
