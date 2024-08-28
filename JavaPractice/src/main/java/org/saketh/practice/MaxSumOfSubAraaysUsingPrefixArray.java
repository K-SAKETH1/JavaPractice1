package org.saketh.practice;
import java.util.*;
public class MaxSumOfSubAraaysUsingPrefixArray {
	public static void max_sum_of_sub_array(int[] arr)
	{
		int prefixArray[] = new int[arr.length];
		prefixArray[0] = arr[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=1;i<prefixArray.length;i++)
		{
			prefixArray[i] = prefixArray[i-1]+arr[i];
		}
		System.out.println(Arrays.toString(prefixArray));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum;
				sum = i==0? prefixArray[j]:prefixArray[j]-prefixArray[i-1];
				if(max<sum)
				{
					max = sum;
				}
				if(min>sum)
				{
					min = sum;
				}
			}
		}
		System.out.println("max sum: "+max);
		System.out.println("min sum: "+min);
	}
}
