package org.saketh.practice;
import java.util.*;
public class ReverseAnArrayEffecient {
	public static void reverse_array(int arr[])
	{
		int first=0,last=arr.length-1;
		while(first<last)
		{
			int temp = arr[last];
			arr[last]= arr[first];
			arr[first]= temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
