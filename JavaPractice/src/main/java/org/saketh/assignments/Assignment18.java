package org.saketh.assignments;
import java.util.*;
public class Assignment18 {
	public static int rotated_half_array_search(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			//checking if the left half is sorted
			if(arr[start]<=arr[mid])
			{
				//if it's sorted - we need to check if target lies between boundaries
				if(target<=arr[mid]&&arr[start]<=target)
				{
					end = mid - 1;
				}
				// if it does not lie between boundaries we eliminate left half
				else
				{
					start = mid +1;
				}
			}
			//if the above condition fails the right half will be sorted at any circumstances
			else
			{
				//check if it lies in the boundaries and eliminate left half in the above half
				if(arr[mid]<=target&&target<=arr[end])
				{
					start = mid + 1;
				}
				//if it does not lie in the left we eliminate it and check in right half
				else
				{
					end = mid - 1;
				}
			}
			
		}
		// if it is not found -1 is returned
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = {7,8,9,1,2,3,4,5,6};
		int key = 5;
		int result = rotated_half_array_search(arr,key);
		System.out.println(result);
	}
}
