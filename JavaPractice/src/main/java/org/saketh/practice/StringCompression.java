package org.saketh.practice;
import java.util.*;
public class StringCompression {
	public static void string_compression(StringBuilder sb)
	{
		StringBuilder newSb = new StringBuilder("");
		for(int i=0;i<sb.length();i++)
		{
			Integer count = 1;
			while(i<sb.length()-1&&sb.charAt(i)==sb.charAt(i+1))
			{
				count++;
				i++;
			}
			newSb.append(sb.charAt(i));
			if(count>1)
			{
				newSb.append(count.toString());
			}
		}
		System.out.println(newSb);
	}
}
