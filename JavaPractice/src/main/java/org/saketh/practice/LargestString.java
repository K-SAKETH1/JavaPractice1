package org.saketh.practice;
import java.util.*;
public class LargestString {
	public static void largest_string(String fruits[])
	{
		String largest = fruits[0];
		for(int i=0;i<fruits.length;i++)
		{
			if(largest.compareToIgnoreCase(fruits[i])<0)
			{
				largest = fruits[i];
			}
		}
		System.out.println("Largest String: "+largest);
	}
}
