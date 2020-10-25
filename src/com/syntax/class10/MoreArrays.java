package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F', 'H'};
		char secValue=grade[1];
		
		String[] names = { "Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya" };
		String secondVal=names[1];
		
		for(int i=0; i<grade.length; i++) {
			
			char valueFromArray=grade[i];
			System.out.println(valueFromArray);
		}
		
		

	}

}
