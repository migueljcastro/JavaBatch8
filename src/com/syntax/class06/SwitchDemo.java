package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * lets ask a tester on which browser they would like to use
		 * 
		 *
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			message="Your code will be executed on Safari browser";
			break;
		case "chrome":
			message="Your code will be executed on Chrome browser";
			break;
		case "firefix":
			message="Your code will be executed on Firefox browser";
			break;
		default:
			message="Entered a browser that is not supported";
		}
		
		System.out.println(message);
		
		
	}

}
