package org.saketh.assignments;
import java.util.*;
public class Assignment9 {
	public static void main(String[] args)
	{
		/*
			Write a program that reads a set of integers,and 
			then prints the sum of the even and odd integers
		*/
		Scanner s = new Scanner(System.in);
		int oddSum = 0;
		int evenSum = 0;
		while(true)
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
			System.out.println("Sum of odd integers: " + oddSum + "\nSum of even integers: "+evenSum);
		}
	}
}
