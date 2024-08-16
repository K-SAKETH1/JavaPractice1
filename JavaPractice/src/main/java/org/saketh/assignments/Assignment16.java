package org.saketh.assignments;
import java.util.*;
public class Assignment16 {
	public static int sumOfDigitsInNumber(int n)
	{
		int sum = 0;
		while(n>0)
		{
			int lastDigit = n%10;
			sum+=lastDigit;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.println("Sum of digits is: "+sumOfDigitsInNumber(n));
	}
}
