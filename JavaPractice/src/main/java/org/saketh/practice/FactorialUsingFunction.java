package org.saketh.practice;
import java.util.*;
public class FactorialUsingFunction {
	public static int factorial(int a)
	{
		int fact = 1;
		for(int i=1; i<=a;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.println("Factorial: "+factorial(n));
	}
}
