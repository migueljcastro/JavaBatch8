package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		
		double d = 12/7;//widening (2.0)
		System.out.println(d);
		
		double e = 9;//widening (9.0)
		System.out.println(e);
		
		int i = (int)9.99;//narrowing (9)
		System.out.println(i);
		
		byte b = (byte) 130;//narrowing (whatever value...)
		System.out.println(b);
		
		
		//int i = 9.99; 
		//casting in java --> converting one type into another
		/*
		 *  2 types of casting: widening - implicit (automatic)
		 *  					byte->short->int->long->float->double
		 *  
		 *  					narrowing - explicit (manual)
		 *  					double->float->long->int->short->byte
		 */
		
		/*
		 *  Assignment Operator 
		 *  =
		 *  Arithmetic Operators
		 *  +, -, *, /, %
		 *  Compound Operators
		 *  +=, -+, *=, /+, %=
		 *  
		 */
	}

}
