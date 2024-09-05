package org.saketh.practice;
import java.util.*;
public class DiagonalSum {
	public static void diagona_sum(int arr[][])
	{
		int primaryDiagonalSum=0;
		int secondaryDiagonalSum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				//for principle diagonal
				if(i==j)
				{
					primaryDiagonalSum+=arr[i][j];
				}
				//for secondary sum
				else if(i+j==arr.length-1)
				{
					secondaryDiagonalSum+=arr[i][j];
				}
			}
		}
		System.out.println("Primary Diagonal Sum: "+primaryDiagonalSum);
		System.out.println("Secondary Diagonal Sum: "+secondaryDiagonalSum);
	}
}
