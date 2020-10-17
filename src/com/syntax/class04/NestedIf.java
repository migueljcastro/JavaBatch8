package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		 * variable for allergy - yes or no
		 * 
		 * if allergy is yes -->
		 * 							we will check if pet allergy
		 * 											if peanut allergy
		 * 											if pollen allergy 
		 * if no allergy you are lucky!!!
		 */

		boolean allergy = true;
		
		boolean petAllergy = true;
		
		
		if(allergy) {//true
			System.out.println("Let's do further checks");
			
			if(petAllergy) {
				System.out.println("Please don't have pets");
			}else {
				System.out.println("That is good you do not have pet allergies");
			}
			
			
		}else {
			System.out.println("You are lucky");
		}
		
		System.out.println("-----------EXAMPLE2------------");
		
		/*
		 * If today is Friday we will watch movies but would like to check the date
		 * 
		 * 		If date is 13th --> watching scary movie 
		 * 		and if it is not --> I will watch comedy, action
		 * 
		 * If its not Friday --> I am studying
		 */
		
		boolean isFriday = true;
		int date = 13;
		boolean monday = true;
		
		if(isFriday) {
			
			if(date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch PK movie with Amir Khan");
			}
			
		}else {
			
			if(monday) {
				System.out.println("I will be working");
			}else {
				System.out.println("I have class at Syntax");
			}
		}
		
		System.out.println("-----------EXAMPLE3------------");
		
		/*check if assign is completed 
		 * if assignment is completed:
		 * 								if score >90 --> great job
		 * 								if score >80 --> good job
		 * 								if score >70 --> please study more 
		 */			
		
		boolean assignment = true;
		int score = 92;
		
		if(assignment) {
			
			if(score>90) {
				System.out.println("great job");
			}else if(score>80) {
				System.out.println("good job");
			}else if(score>70) {
				System.out.println("please study more");
			}
			
		}else {
			System.out.println("I cannot grade an assignment not completed");
		}
		
		System.out.println("-----------EXAMPLE4------------");
		
		boolean diploma = true;
		double gpa = 3.5;
		
		if(diploma) {
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else if(gpa<3.5) {
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("Get a degree!");
		}
		
		System.out.println("-----------EXAMPLE5------------");
		
		double mRate = 4.5;
		int mPrice = 200000;
		
		if(mRate>4.5) {
			if(mRate<4.5) {
				System.out.println("I will consider buying a house");
			}else if(mPrice>200000) {
				System.out.println("I will get a loan");
			}else if(mPrice<200000) {
				System.out.println("I will pay cash");
			}
		
		
		}else {
			System.out.println("I will not buy a house");
		}
		
			
			
	}

}
