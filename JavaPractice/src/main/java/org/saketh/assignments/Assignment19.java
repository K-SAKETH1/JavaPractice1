package org.saketh.assignments;
import java.util.*;
public class Assignment19 {
	//  Print the number of 7’s that are in the 2d array	
	public static void noOf_7s(int arr[][])
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==7)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		int[][] array = { {4,7,8},{8,8,7} };
		noOf_7s(array);
	}
}
