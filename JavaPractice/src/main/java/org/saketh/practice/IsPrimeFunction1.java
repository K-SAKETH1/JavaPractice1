package org.saketh.practice;
import java.util.*;
public class IsPrimeFunction1 {
	public static boolean isPrime(int n)
	{
		boolean isPrime = true;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.println(isPrime(n));
	}
}
