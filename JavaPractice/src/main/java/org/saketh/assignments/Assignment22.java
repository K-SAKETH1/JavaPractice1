package org.saketh.assignments;
import java.util.*;
public class Assignment22 {
	public static void lowercase_vowel_counter(StringBuilder sb)
	{
		int count = 0;
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("No of lower case vowels: "+count);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder(str);
		lowercase_vowel_counter(sb);
	}
}
