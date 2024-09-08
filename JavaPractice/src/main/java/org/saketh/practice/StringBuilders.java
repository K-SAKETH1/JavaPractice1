package org.saketh.practice;
import java.util.*;
public class StringBuilders {
	public static void main(String[] args)
	{
		StringBuilder sbr = new StringBuilder("");
		for(char i='a';i<='z';i++)
		{
			sbr.append(i);
		}
		System.out.println(sbr);
	}
}
