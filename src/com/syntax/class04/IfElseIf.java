package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/*
		 * we need to compare 2 numbers:
		 * bigger, smaller or equal 
		 */
		
		int num1=9;
		int num2=99;
		
		if(num1>num2) {//what if this condition is true
			System.out.println(num1+" is bigger than  "+num2);
		}else if(num1<num2) {//or what if this is true
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println("----------------------------");
		
		
		/* Based on the day of the week we will print class schedule 
		 * 
		 */
		
		int day=99;
		
		if(day==1) {
				System.out.println("Today is Monday we have no class");
		}else if(day==2) {
				System.out.println("Today is Tuesday we have Manual class");
		}else if(day==3) {
				System.out.println("Today is Wednesday and we have Manual class again");
		}else if(day==4) {
				System.out.println("Today is Thurday and we have review class");
		}else if(day==5) {
				System.out.println("Today is Friday but I have class tomorrow and I will be prepared");
		}else if (day==6) {
				System.out.println("Today is Saturday, I miss Java Classes");
		}else if(day==7) {
				System.out.println("Today is Sunday, I did a lot of coding");
		}else {
			System.out.println("This is an invalid entry, please provide day from 1 to 7");
		}
				
		System.out.println("----------------TASK1------------------");
		
		int month=7;
		
		if(month==1) {
			System.out.println("Juanuary");
			}else if (month==2) {
				System.out.println("February");
			}else if (month==3) {
				System.out.println("March");
			}else if (month==4) {
				System.out.println("April");
			}else if (month==5) {
				System.out.println("May");
			}else if (month==6) {
				System.out.println("June");
			}else if (month==7 ) {
				System.out.println("July");
			}else if (month==8) {
				System.out.println("August");
			}else if (month==9) {
				System.out.println("September");
			}else if (month==10) {
				System.out.println("October");
			}else if (month==11) {
				System.out.println("November");
			}else if (month==12) {
				System.out.println("December");
			}
		
		System.out.println("--------------TASK2--------------");
		
		int weather=70;
		
		if(weather<0) {
			System.out.println("It's a positive number");
		}else {
			System.out.println("It's a negative number");
		}
		
		System.out.println("----------------TASK3-----------------");
		
		int wCondition1 = 20;
		int wCondition2 = 6;
		
		if(wCondition1%wCondition2==0) {
			System.out.println(wCondition1+" is an even number");
		}else {
			System.out.println(wCondition1+" is an odd number");
		}
		
		
		
	}

}
