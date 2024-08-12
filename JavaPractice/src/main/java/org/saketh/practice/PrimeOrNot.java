package org.saketh.practice;
import java.util.*;
public class PrimeOrNot {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int digit = s.nextInt();
		int count=0;
		for(int i=1;i<=digit;i++)
		{
			if(digit%i==0)
			{
				count++;
			}
		}
		if(count>=3)
		{
			System.out.println(digit + " is not a prime number");
		}
		else {
			System.out.println(digit + " is a prime number");
		}
	}
}
