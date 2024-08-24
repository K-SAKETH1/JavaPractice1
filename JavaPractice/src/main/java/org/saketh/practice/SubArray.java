package org.saketh.practice;
import java.util.*;
public class SubArray {
	public static void sub_array(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++)
			{
				int sum = 0;
				System.out.print(" [ ");
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
					System.out.print(arr[k]+" ");
				}
				System.out.print(" ] "+"sum: "+sum);
				if(max<sum)
				{
					max = sum;
				}
				if(min>sum)
				{
					min = sum;
				}
				System.out.println();
			}
			System.out.print(" min: "+min+" max: "+max);
			System.out.println();
		}
		
	}
}
