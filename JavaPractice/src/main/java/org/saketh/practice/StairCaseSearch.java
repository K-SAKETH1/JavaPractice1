package org.saketh.practice;
import java.util.*;
public class StairCaseSearch {
	public static void staircase_search(int arr[][])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter key value: ");
		int key = s.nextInt();
		int down = 0;
		int left = arr[0].length-1;
		while(down<arr[0].length&&left>=0)
		{
			if(key==arr[down][left])
			{
				System.out.println(+key+" is found at index ("+down+","+left+")");
				break;
			}
			else if(key<arr[down][left])
			{
				left--;
			}
			else
			{
				down++;
			}
		}
		System.out.println(+key+" is not found");
	}
}
