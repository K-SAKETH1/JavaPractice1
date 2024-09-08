package org.saketh.practice;
public class StringPalindromeTest {
	public static void main(String[] args)
	{
		String str = "racecar";
		boolean result = StringPalindrome.string_palindrome(str);
		if(result==true)
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
	}
}
