package org.saketh.practice;
import java.util.*;
public class SearchingIn2DArray {
	public static int search_2DArray(int arr[][])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter key value: ");
		int key = s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==key)
				{
					System.out.println(+key+" is present at ("+i+","+j+")");
				}
			}
		}
		return key;
	}
}
