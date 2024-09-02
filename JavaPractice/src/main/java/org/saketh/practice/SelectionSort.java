package org.saketh.practice;
import java.util.*;
public class SelectionSort {
	public static void selection_sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minPos = i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[minPos]>arr[j])
				{
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
