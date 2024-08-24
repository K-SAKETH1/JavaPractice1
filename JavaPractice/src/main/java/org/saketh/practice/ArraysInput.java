package org.saketh.practice;
import java.util.*;
public class ArraysInput {
	public static int[] input_array()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int length = s.nextInt();
		int arr[] = new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter element "+(i+1)+": ");
			arr[i]=s.nextInt();
		}
		return arr;
	}
}
