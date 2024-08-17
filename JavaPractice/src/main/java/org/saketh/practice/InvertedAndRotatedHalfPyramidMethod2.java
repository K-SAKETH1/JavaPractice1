package org.saketh.practice;
import java.util.*;
public class InvertedAndRotatedHalfPyramidMethod2 {
	public static void inverted_rotated_halfPyramid(int totalRows)
		{
			for(int i=1;i<=totalRows;i++)
			{
				for(int j=1;j<=totalRows-i;j++)
				{
						System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
						System.out.print("*");
				}
				System.out.println();
			}
		}
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter total no of rows: ");
			int rows = s.nextInt();
			System.out.print("Enter totsl no of columns: ");
			int col = s.nextInt();
			inverted_rotated_halfPyramid(rows);
		}
}
