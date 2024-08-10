package org.saketh.practice;
import java.util.*;
public class ElseIf {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		if(age>=18)
		{
			System.out.println("Is an adult\nCan Drive\nCan Vote");
		}
		else if (age>=13 && age<18)
		{
			System.out.println("Is a teenager");
		}
		else
		{
			System.out.println("Not an adult");
		}
	}
}
