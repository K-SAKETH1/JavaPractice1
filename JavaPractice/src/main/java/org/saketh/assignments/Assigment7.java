package org.saketh.assignments;
import java.util.*;
public class Assigment7 {
	public static void main(String[] args)
	{
		/* Write a Java program that takes a year from the user and print whether that
 		year is a leap year or not.*/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = s.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year +" is a leap year");
				}
				else
				{
					System.out.println(year +" is not a leap year");
				}
			}
			else
			{
				System.out.println(year + " is a leap year");
			}
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}
}
