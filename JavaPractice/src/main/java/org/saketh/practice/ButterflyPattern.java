package org.saketh.practice;
import java.util.*;
public class ButterflyPattern {
	public static void butterfly_pattern(int totalRows)
	{
		//First Half
		for(int i=1;i<=totalRows;i++)
		{
			//Stars
			for(int j=1;j<=i;j++)
			{
					System.out.print("* ");
			}
			//Spaces
			for(int k=1;k<=(2*(totalRows-i));k++)
			{
				System.out.print(" " + " ");
			}
			//Stars
			for(int l=1;l<=i;l++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		//Second Half
		for(int i=totalRows;i>0;i--)
		{
			//Stars
			for(int j=i;j>0;j--)
			{
					System.out.print("* ");
			}
			//Spaces
			for(int k=(2*(totalRows-i));k>0;k--)
			{
				System.out.print(" " + " ");
			}
			//Stars
			for(int l=i;l>0;l--)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int row = s.nextInt();
		butterfly_pattern(row);
	}
}
