package com.syntax.class06;

public class NotMoreExamples {

	public static void main(String[] args) {
		
		Boolean isJavaEasy=false;

		if(!isJavaEasy){
		   System.out.println("Please try to spend more time with Java");
		}

		System.out.println("-----------------------------------");
		
		String day="Saturday";
		
		if(!(day.equals("Sunday") || day.equals("Saturday"))){
			System.out.println("I will go to work");
		}
	}
}
