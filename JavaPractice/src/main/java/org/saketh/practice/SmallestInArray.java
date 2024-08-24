package org.saketh.practice;
import java.util.*;
public class SmallestInArray {
	public static int smallest_in_array(int arr[]) 
	{
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
			{
				smallest = arr[i];
			}
		}
		return smallest;
	}
}
