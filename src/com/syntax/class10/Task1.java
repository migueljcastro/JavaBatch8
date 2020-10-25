package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		
		char[] grades= new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		String[] groupNames= {"Juan", "Gabby", "Elias", "Mulu", "Danny"};
		
		System.out.println(groupNames[3]);
		
		String[] gNames= new String[5];
		gNames[0]="Juan";
		gNames[1]="Gabby";
		gNames[2]="Elias";
		gNames[3]="Mulu";
		gNames[4]="Danny";
		
		System.out.println(gNames[4]);
		
		String[] arrays = {"Java", "Saturday", "Day", "Coding", "is"};
		
		System.out.println(arrays[1]+" "+arrays[4]+" "+arrays[0]+" "+arrays[3]+" "+arrays[2]);


	}

}
