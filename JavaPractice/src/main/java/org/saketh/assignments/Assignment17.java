package org.saketh.assignments;
import java.util.*;
public class Assignment17 {
	/*
	 Given an integer array nums, return true if any value appears at least twice in the 
	 array, and return false if every element is distinct.
	*/
	public static boolean assigment_17(int arr[])
	{
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}	
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		boolean result = assigment_17(org.saketh.practice.ArraysInput.input_array());
		System.out.println(result);
	}
}
