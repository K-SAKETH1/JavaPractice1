package org.saketh.practice;
import java.util.*;
public class ReverseStairCaseSearch {
	public static void reverse_staircase_search(int arr[][])
	{
		int top = arr.length-1;
		int right = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter key value: ");
		int key = s.nextInt();
		while(top>=0&&right<arr.length)
		{
			if(key==arr[top][right])
			{
				System.out.println(+key+" is found at ("+top+","+right+")");
				break;
			}
			else if(key>arr[top][right])
			{
				right++;
			}
			else if(key<arr[top][right])
			{
				top--;
			}
			else
			{
				System.out.println(+key+" is not found");
				break;
			}
		}
		
	}
}
