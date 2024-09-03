package org.saketh.practice;
import java.util.*;
public class CrestionOf2DArray {
	public static void main(String[] args)
	{
		int matrix[][] = new int [3][3];
		System.out.println(matrix.length);
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)	
			{
				System.out.print("Enter ("+i+","+j+") element: ");
				matrix[i][j] = s.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}
}
