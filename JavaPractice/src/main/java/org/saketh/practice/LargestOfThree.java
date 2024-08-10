package org.saketh.practice;
import java.util.*;
public class LargestOfThree {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = s.nextInt();
		System.out.print("Enter the value of B: ");
		int b = s.nextInt();
		System.out.print("Enter the value of C: ");
		int c = s.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("Largest Number Is: "+a);
		}
		else if (b>=c)
		{
			System.out.println("Largest Number Is: "+b);
		}
		else
		{
			System.out.println("Largest Number Is: "+c);
		}
	}
}
