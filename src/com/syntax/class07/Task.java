package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true
		 * create int variable day and assign it to 1
		 * as long as it is workDay print "i need a day off" and increase day.
		 * Once day is 6 print "I do not need a day off anymore"
		 */
		
		boolean workDay=true;
		
		int day=1;
		
		while(workDay) {
			
			if(day<6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("It is weekend and I am off");
				workDay=false;
			}
			
			day++;
		}

	}

}
