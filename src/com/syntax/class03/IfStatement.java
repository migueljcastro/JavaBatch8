package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * To debug:
		 * 			1. place breakpoint at any line you would like to start debugging
		 * 			2. right click --> debug
		 * 			3. if some window pops up --> click on switch
		 * 			4. and then click on step over to debug line by line
		 * 			5. if you want to stop debugging click on red square
		*/
		
		
		int num1 = 180;
		int num2 = 900;
		
		System.out.println("writing my first is statement");
		
		
		if(num1>num2) {
			System.out.println("num1 is bigger than num2");
		}
		
		
		System.out.println("End of if statement");
		
		
		System.out.println("________________");
		
		int temp = 60;
		
		if(temp>=60) {
			System.out.println("I am going to the beach ");//true condition
		}else {
			System.out.println("I will go for a walk");//false condition
		}
		
		System.out.println("________________");
		
		double expectedHours = 15;
		double actualHours = 20;
		
		if(actualHours>expectedHours) {
			System.out.println("You will love the course and you will succeed");
		}else {
			System.out.println("Course wull be too hard for you!");
		}
		
		/*
		 * Control Flow:
		 * 				if statement
		 * 				syntax for if statement 
		 * 				if (boolean expression) {
		 * 				code....
		 * }else {
		 * 				code....
		 * }
		 */
		
		
	}

}
