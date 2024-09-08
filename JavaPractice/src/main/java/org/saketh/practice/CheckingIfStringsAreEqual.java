package org.saketh.practice;
import java.util.*;
public class CheckingIfStringsAreEqual {
	public static void main(String[] args)
	{
		String s1 = "Saketh";
		String s2 = "Saketh";
		String s3 = new String("Saketh");
		//Using == operator
		if(s1==s2)
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		if(s1==s3)
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		//using equals function
		if(s1.equals(s2))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		if(s1.equals(s3))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
	}
}
