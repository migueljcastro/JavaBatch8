package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		
		//boolean sleep = false;
		/*
		 * if not sleep --> I will study otherwise I will take a nap
		 * 
		 * if (sleep==true){
		 * 		System.out.println("I will take a nap");
		 * }else {
		 * 		Sysytem.out.println("I will study some Java");
		 * }
		 */
		
		
		double money = 2;
		double iceCream = 5.59;

		if (money >= iceCream) {
			System.out.println("I am buying ice cream");
			System.out.println("I would like vanilla flavor");
		} else {
			System.out.println("Sorry, no ice cream");
			System.out.println("Do not worry less sugar for you");
		}
		System.out.println("I am code that executes without any condition");
		
		
		double val1 = 39.99;
		double val2 = 79.99;
		
		if(val1>val2) {
			System.out.println("Double value "+val1+" is higher than "+val2);
		}else {
			System.out.println("Double value "+val1+" is not higher than "+val2);
		}
		
		double temp =70;
		
		if(temp<=32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will not freeze with temperature "+temp);
		}
		
		boolean sleepy = false;
		
		//if(not sleep) I will study otherwise I will take a nap
		
		 if (sleepy==true){
		  		System.out.println("I will take a nap");
		 }else {
		  		System.out.println("I will study some Java");
		 }
		
		 		System.out.println("______________");
		 		
		 		
		 boolean hungry = false;
		 
		 if(hungry) {
			 System.out.println("I will go eat");
		 }else {
			 System.out.println("I will continue studying");
		 }
		 
	}

}
