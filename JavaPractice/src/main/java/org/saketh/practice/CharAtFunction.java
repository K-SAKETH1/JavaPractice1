package org.saketh.practice;
import java.util.*;
public class CharAtFunction {
	public static void print_string(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args)
	{
		String firstName = "Saketh";
		String lastName = "Kusuma";
		String fullName = firstName+" "+lastName;
		System.out.println(fullName.charAt(0));
		print_string(fullName);
	}
}
