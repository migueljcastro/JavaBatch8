package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {

		String name="Olga";
		
		//I would like to say : my name is Olga
		
		System.out.println("My name is "+name);
		
		String lastName="Sorrels";
		//I would like to print Olga Sorrels
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		//Olga lives in Miami
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//Olga is a B student
		System.out.println(name+" is a "+grade+" student ");
		
		int age=21;
		//Olga is 21 years old
		System.out.println(name+" is "+age+" years old ");
		/*to attche/concatenate ANY value (char, int, String, double)
		 */
		
		int          date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="     DC";
		// above Strings are not equal, state has 2 characters and anotherState has 3 character
		System.out.println(state);
		System.out.println(anotherState);
		
		
	}

}
