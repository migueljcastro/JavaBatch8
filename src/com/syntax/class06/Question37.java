package com.syntax.class06;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     boolean thirsty = true;
	     boolean sleepy = true;
	     String drink = null;
	     System.out.println("Are you thristy?");
	     thirsty = input.nextBoolean();
	     System.out.println("Are you sleepy?");
	     sleepy = input.nextBoolean();
	     
	     if(thirsty && !sleepy){
	       drink = "Water";
	     }else if(thirsty && sleepy){
	       drink = "Coffee";
	     }else if((!thirsty) == sleepy){
	       drink = "Tea";
	     }else{
	       drink = "Nothing";
	     }
	     System.out.println("Looks like you need to drink "+drink);
	}

}
