package org.saketh.practice;
import java.util.*;
public class BinomialCoefficient {
	public static int factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void binomialCoefficient(int n, int r)
	{
		int nFact = factorial(n);
		int rFact = factorial(r);
		int binomialCoefficent = (nFact/(rFact*factorial(n-r)));
		System.out.println("Binomial Coefficent: "+binomialCoefficent);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.print("Enter r value: ");
		int r = s.nextInt();
		binomialCoefficient(n,r);
	}
}
