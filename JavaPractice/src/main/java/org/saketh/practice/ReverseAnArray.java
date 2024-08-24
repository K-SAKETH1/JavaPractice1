package org.saketh.practice;
import java.util.*;
public class ReverseAnArray {
	public static void reverse_array(int arr[])
	{
		int reverse[] = new int[arr.length];
		int index=0;
		for(int i=(arr.length-1);i>=0;i--)
		{
			reverse[index]=arr[i];
			index++;
		}
		System.out.println(Arrays.toString(reverse));
	}
}
