package org.saketh.assignments;
import java.util.*;
public class Assignment15 {
	public static boolean palindrome()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = s.nextInt();
		int temp = n;
		int reverse = 0;
		boolean isPalindrome;
		while(temp>0)
		{
			int lastDigit = temp%10;
			reverse = (reverse*10)+lastDigit;
			temp/=10;
		}
		if(reverse==n)
		{
			isPalindrome = true;
		}
		else
		{
			isPalindrome = false;
		}
		return isPalindrome;
	}
	public static void main(String[] args)
	{
		if(palindrome())
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
