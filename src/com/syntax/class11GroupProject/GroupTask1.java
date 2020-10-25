package com.syntax.class11GroupProject;

public class GroupTask1 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;

		System.out.println("Before swap " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x = " + x + " and y = " + y);

	}

}
