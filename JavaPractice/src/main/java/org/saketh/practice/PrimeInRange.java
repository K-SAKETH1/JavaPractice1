package org.saketh.practice;
import java.lang.Math;
import java.util.*;
public class PrimeInRange {
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
	public static void PrimeRange(int a, int b)
	{
		for(int i=a; i<b; i++)
		{
			if(isPrime(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = s.nextInt();
		System.out.print("Enter b value: ");
		int b = s.nextInt();
		PrimeRange(a,b);
	}
}
