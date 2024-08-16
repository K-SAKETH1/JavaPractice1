package org.saketh.practice;
import java.lang.Math;
import java.util.*;
public class IsPrimeOptimized {
	public static boolean isPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.println(isPrime(n));
	}
}
