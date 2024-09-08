package org.saketh.practice;
import java.util.*;
public class ToUpperCase {
	public static void to_uppercase(StringBuilder sbr)
	{
		for(int i=0;i<sbr.length();i++)
		{
			if(i==0||sbr.charAt(i-1)==' '&&i<sbr.length()-1)
			{
				Character ch = Character.toUpperCase(sbr.charAt(i));
				sbr.setCharAt(i, ch);
			}
		}
		System.out.println(sbr);
	}
}
