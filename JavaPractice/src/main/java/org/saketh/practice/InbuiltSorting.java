package org.saketh.practice;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class InbuiltSorting {
	public static void main(String[] args)
	{
		Integer arr [] = {5,4,1,3,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
