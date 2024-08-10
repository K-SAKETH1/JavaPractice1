package org.saketh.practice;
import java.util.*;
public class IncomeTax {
	public static void main(String[] args)
	{
		double incomeTax;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your income: ");
		int income = s.nextInt();
		if(income<500000)
		{
			incomeTax = (0*income);
		}
		else if (income>=500000 && income<=1000000)
		{
			incomeTax = (0.2*income);
		}
		else
		{
			incomeTax = (0.3*income);
		}
		System.out.println("Income Tax Payable: "+incomeTax);
	}
}
