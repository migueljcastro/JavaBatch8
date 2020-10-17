package com.syntax.class05;

import java.util.Scanner;

public class ExerciseImproved {

	public static void main(String[] args) {
		
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
		
			char grade;
			
			if(avg>=90) {
				grade='A';
			}else if(avg>=70 && avg<90) {
				grade='B';
			}else if(avg>=50 && avg<70) {
				grade='C';
			}else if(avg>=40 && avg<50) {
				grade='D';
			}else {
				grade='F';
			}
			
			System.out.println("Grade is = "+grade);
			
			if(grade=='A' || grade=='B') {
				System.out.println("You are good student");
			}else {
				System.out.println("Please study more");
			}
		}

	}


