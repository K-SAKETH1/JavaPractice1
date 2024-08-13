package org.saketh.assignments;
import java.util.*;
public class Assignment8 {
	public static void main(String[] args)
	{
		/*
			Write a program that reads a set of integers,and 
			then prints the sum of the even and odd integers
		*/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of integers: ");
		int range = s.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1;i<=range;i++)
		{
			System.out.print("Enter the integers: ");
			int input = s.nextInt();
			if(input%2==0)
			{
				evenSum+=input;
			}
			else
			{
				oddSum+=input;
			}
		}
		System.out.println("Sum of odd integers: " + oddSum + "\nSum of even integers: "+evenSum);
	}
}
