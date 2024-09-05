package org.saketh.assignments;

import java.util.Arrays;

public class Assignment21 {
	public static void transpose_matrix(int arr[][])
	{
		int transposeMatrix[][] = new int[arr[0].length][arr.length];
		for(int i=0;i<transposeMatrix.length;i++)
		{
			for(int j=0;j<transposeMatrix[0].length;j++)
			{
				transposeMatrix[i][j] = arr[j][i];
			}
		}
		System.out.println(Arrays.deepToString(transposeMatrix));
	}
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3},{4,5,6}};
		transpose_matrix(arr);
	}
}
