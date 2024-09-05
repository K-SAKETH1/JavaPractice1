package org.saketh.practice;
import java.util.*;
public class TwoDimensionArrayInput {
	public static int[][] arrays_input()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n = s.nextInt();
		System.out.print("Enter no of columns: ");
		int m = s.nextInt();
		int matrix[][] = new int[n][m];
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<m;j++)	
			{
				System.out.print("Enter ("+i+","+j+") element: ");
				matrix[i][j] = s.nextInt();
			}
		}
		return matrix;
	}
}
