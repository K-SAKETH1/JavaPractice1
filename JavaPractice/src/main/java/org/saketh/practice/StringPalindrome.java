package org.saketh.practice;
import java.util.*;
public class StringPalindrome {
	public static boolean string_palindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		int count = 0;
		while(start<=end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
