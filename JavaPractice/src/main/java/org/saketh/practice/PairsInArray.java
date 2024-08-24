package org.saketh.practice;
import java.util.*;
public class PairsInArray {
	public static void pairs_in_array(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int current = arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print("("+current+","+arr[j]+")");
			}
			System.out.println();
		}
	}
}
