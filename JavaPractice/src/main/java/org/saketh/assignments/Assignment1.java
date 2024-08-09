package org.saketh.assignments;
import java.util.*;
public class Assignment1 {
	/* In a program, input 3 numbers: A, B andC. You have to output the average of
 these 3 numbers*/
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A: ");
		int a = s.nextInt();
		System.out.print("Enter B: ");
		int b = s.nextInt();
		System.out.print("Enter C: ");
		int c = s.nextInt();
		int avg = (a+b+c)/3;
		System.out.println("Average of A,B,C: "+avg);
	}
}
