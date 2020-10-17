package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to create a variable
		
		// create variable = assigning value
		//declare a variable = initializing 
		double $num=12.99;
		
		//2 way to create a variable
			//declare a variable
			//initialize or assign value
		
		int myBox;//we declare a variable only once
		myBox=135;//assigning value
		System.out.println(myBox);//135
		
		myBox=155;//assigning value
		System.out.println(myBox);//155
		
		//3rd way
		int num1, num2, num3;//if variable is of the same type, we can declare it all in one line
		num1=10;
		num2=20;
		num3=30;
		
		System.out.println(num3);
		
		//what will be the output?
		char char1='C';
		char char2='d';
				
		char char3=char1;
		System.out.println(char3);//C
		
		
	}

}
