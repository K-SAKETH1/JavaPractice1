package org.saketh.practice;
import java.util.*;
public class BinarySearch {
	public static void binary_search(int arr[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter key value: ");
		int key = s.nextInt();
		int start = 0;
		int end = arr.length;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==key)
			{
				System.out.println(+key+" is found at index "+mid);
				break;
			}
			else if(arr[mid]>key)
			{
				end = mid-1;
			}
			else if(arr[mid]<key)
			{
				start = mid+1;
			}
			else
			{
				System.out.println(+key+" is not found");
			}
		}
	}
}
