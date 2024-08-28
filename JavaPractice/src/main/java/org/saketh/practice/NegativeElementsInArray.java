package org.saketh.practice;

public class NegativeElementsInArray {
	public static int negative_elements_count(int arr[])
	{ 
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		return count;
	}
}
