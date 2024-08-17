package org.saketh.practice;
import java.util.*;
public class InvertedAndRotatedHalfPyramid {
	public static void inverted_rotated_halfPyramid(int totalRows)
	{
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=1;j<=totalRows;j++)
			{
				if(j>(totalRows-i))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter total no of rows: ");
		int rows = s.nextInt();
		System.out.print("Enter total no of columns: ");
		int col = s.nextInt();
		inverted_rotated_halfPyramid(rows);
	}
}
