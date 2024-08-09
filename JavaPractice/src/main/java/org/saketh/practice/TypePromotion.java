package org.saketh.practice;

public class TypePromotion {
	/* Whenever a expresiion is performed
	   byte,short,char => integer 
	 */
	public static void main (String[] args)
	{
		char a = 'a';
		char b = 'b';
		/* 
		 Above we have only used char but we get output as int 
		 wrong method:
		 char c = b - a;
		 System.out.println("b-a: "+c);
		 */
		int c = b - a;
		System.out.println("b-a: "+c);
		
		/*
		  Whenever if there are float,double,longs types then all the expression 
		  is converted to largest datatype from them
		*/
		int i = 25;
		float f = 21.22f;
		double d = 21.2345;
		long l = 23;
		/*
		 wrong method:
		 int add = i + f + d + f;
		*/
		double add = i + f + d + f;
		System.out.println("Add: "+add);
	}
}
