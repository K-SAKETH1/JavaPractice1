package org.saketh.practice;
import java.util.*;
public class AdditionUsingFunction {
	public static int sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value:");
		int a = s.nextInt();
		System.out.print("Enter b value:");
		int b = s.nextInt();
		System.out.println("Sum:"+sum(a,b));
	}
}
