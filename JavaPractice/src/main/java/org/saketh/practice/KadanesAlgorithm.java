package org.saketh.practice;
public class KadanesAlgorithm {
	public static void max_sub_array_sum(int arr[])
	{
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			cs+=arr[i];
			if(cs<0)
			{
				cs = 0;
			}
			ms = Math.max(cs, ms);
		}
		System.out.println("max sum of sun arrays: "+ms);
	}
}
