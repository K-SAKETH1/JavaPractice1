package org.saketh.practice;
import java.util.*;
public class IfElse {
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		if(age>=18)
		{
			System.out.println("Is an adult\nCan vote\nCan drive");
		}
		else
		{
			System.out.println("Not an adult");
		}
	}
}
