package org.saketh.practice;
public class KadansAlgorithmSpecialCase {
	public static void max_sub_array_sum(int arr[])
	{
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		int cm = 0;
		int count = NegativeElementsInArray.negative_elements_count(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(count==arr.length)
			{
				cm = Math.max(arr[i], cs+=arr[i]);
				ms = Math.max(cm, ms);
			}
			else
			{
				cs+=arr[i];
				if(cs<0)
				{
					cs=0;
				}
				ms = Math.max(cs,ms);
			}
			
		}
		System.out.println("max sum of sub arrays: "+ms);
	}
}
