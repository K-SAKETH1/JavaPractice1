package org.saketh.assignments;
import java.util.*;
public class Assignment10 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		int factorial = 1;
		int temp = 1;
		while(temp<=n)
		{
			factorial*=temp;
			temp++;
		}
		System.out.println("Factorial of "+n+" is: "+factorial);
	}
}
