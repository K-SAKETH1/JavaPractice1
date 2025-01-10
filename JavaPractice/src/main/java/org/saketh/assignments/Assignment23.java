package org.saketh.assignments;
import java.util.*;
public class Assignment23 {
	public static void main(String[] args)
	{
		String str1 = "read";
		String str2 = "dear";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length()==str2.length())
		{
			char str1CharArray[] = str1.toCharArray();
			char str2CharArray[] = str2.toCharArray();
			Arrays.sort(str1CharArray);
			Arrays.sort(str2CharArray);
			boolean result = Arrays.equals(str1CharArray, str2CharArray);
			if(result)
			{
				System.out.println(str1+" and "+str2+" are anagaram");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not anagaram");
			}
		}
		else
		{
			System.out.println(str1+" and "+str2+" are not anagaram");
		}
	}
}
