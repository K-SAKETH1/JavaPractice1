package org.saketh.practice;
import java.util.*;
public class Substrings {
	public static void sub_string(String str)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter starting index: ");
		int si = s.nextInt();
		System.out.print("Enter ending index (Exclusive): ");
		String subStr = "";
		int ei = s.nextInt();
		for(int i=si;i<ei;i++)
		{
			subStr+=str.charAt(i);
		}
		System.out.println(subStr);
	}
}
