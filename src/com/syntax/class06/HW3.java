package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * 3.You are working in sales and have to calculate commission for the
		 * employees;
		 * 
		 * You need to ask user a sales amount and based on the amount you need to
		 * define their commission
		 * 
		 * if user sold products for more than $10 but less than 100 --> commission is
		 * 10%
		 * 
		 * if sales is more than 100 but less then 200 --> commission is 20%
		 * 
		 * if sales is more than 200 but less then 500 --> commission is 30%
		 * 
		 * if sales is more than 500 --> commission is 50%
		 * 
		 * You program should print How much in commission user will get
		 * 
		 */
		System.out.println("Please enter the Sale Amount");

		double sales = input.nextDouble();
		double Comission;

		if(sales>=10&&sales<100)
		{
			Comission = (sales * 10) / 100;
		}else if(sales>=100&&sales<200)
		{
			Comission = (sales * 20) / 100;
		}else if(sales>=200&&sales<500)
		{
			Comission = (sales * 30) / 100;
		}else if(sales>=500)
		{
			Comission = (sales * 50) / 100;
		}else
		{
			Comission = 0;
		}System.out.println("The Comission is "+Comission);

		// if you sell more than 1k --> you are an awesome seller
		if(Comission>1000)
		{
			System.out.println("You are an awesome seller");
		}
	}

	

	}


