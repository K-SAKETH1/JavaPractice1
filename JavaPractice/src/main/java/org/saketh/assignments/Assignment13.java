package org.saketh.assignments;
import java.util.*;
public class Assignment13 {
	//	Write a Java method to compute the average of three numbers.
	public static float average(int a, int b, int c)
	{
		return ((a+b+c)/3);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = s.nextInt();
		System.out.print("Enter b value: ");
		int b = s.nextInt();
		System.out.print("Enter c value: ");
		int c = s.nextInt();
		System.out.println("Average of a,b,c: "+average(a,b,c));
	}
}
