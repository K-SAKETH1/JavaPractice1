package org.saketh.assignments;
import java.util.*;
public class Assignment4 {
	public static void main(String[] args)
	{
		/*
		Write a Java program to get a number from the user and print whether it is
 			positive or negative
		*/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = s.nextInt();
		String type = (number>0)? "POSITIVE":"NEGATIVE";
		System.out.println(type);
	}
}
