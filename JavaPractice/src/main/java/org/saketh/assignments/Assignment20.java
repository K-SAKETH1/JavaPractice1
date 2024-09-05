package org.saketh.assignments;
import java.util.*;
public class Assignment20 {
	public static void rows_sum(int arr[][])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = s.nextInt();
		int sum = 0;
		for(int j=0;j<arr[0].length;j++)
		{
			sum+=arr[row][j];
		}
		System.out.print("Sum: "+sum);
	}
	public static void main(String[] args)
	{
		int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
		rows_sum(nums);
	}
}
