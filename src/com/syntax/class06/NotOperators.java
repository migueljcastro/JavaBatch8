package com.syntax.class06;

public class NotOperators {

	public static void main(String[] args) {
		
		// ! = NOT operator reverses true or false
		
		boolean b=!true;
		System.out.println(b);
		
		boolean anotherBoolean=!false;
		System.out.println(anotherBoolean);
		
		System.out.println("----------------------------------------");
		
		boolean isCold=false;
		
		if(!isCold) {
			System.out.println("I am going to the beach");
		}

	}

}
