package org.saketh.practice;
import java.util.*;
public class HollowRectanglePattern {
	public static void hollow_rectangle(int totalRows, int totalColumns)
	{
		for(int i=1;i<=totalRows;i++)
		{
			for(int j=1;j<=totalColumns;j++)
			{
				if(i==1||i==totalRows||j==1||j==totalColumns)
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
		System.out.print("Enter no of rows: ");
		int rows = s.nextInt();
		System.out.print("Enter no of columns: ");
		int col = s.nextInt();
		hollow_rectangle(rows, col);
	}
}
