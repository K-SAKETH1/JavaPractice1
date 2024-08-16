package org.saketh.practice;
import java.util.*;
public class IsPrimeFunction2 {
	public static boolean isPrime(int n)
	{
		//corner case for n = 2
		if(n==2)
		{
			return true;
		}
		for(int i=2;i<=n;i++)
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
