package org.saketh.practice;
import java.util.*;
public class LargestInArray {
	public static int largest_in_array(int arr[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
}
