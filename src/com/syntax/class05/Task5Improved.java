package com.syntax.class05;

import java.util.Scanner;

public class Task5Improved {

	public static void main(String[] args) {
		Scanner input;
		String month;
		String season = null;
		
		input = new Scanner(System.in);
		System.out.println("Please, enter your birth month");
		month=input.next();
		
		if(month.equals("June")||month.equals("July")||month.equals("August")) {
			season="Summer";
		} else if (month.equals("September")||month.equals("October")||month.equals("November")) {
			season="Fall";
		} else if (month.equals("December")||month.equals("January")||month.equals("February")) {
			season="Winter";
		} else if (month.equals("March")||month.equals("April")||month.equals("May")) {
			season="Spring";
		}//else{season="Invalid";}
		
		System.out.println("You were born in "+season);
	}

}
