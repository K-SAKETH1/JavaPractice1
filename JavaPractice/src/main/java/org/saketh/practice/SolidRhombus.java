package org.saketh.practice;
import java.util.*;
public class SolidRhombus {
	public static void solid_rhombus(int rows, int stars)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" "+ " ");
			}
			for(int k=1;k<=stars;k++)
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
		System.out.print("Enter no of stars: ");
		int stars = s.nextInt();
		solid_rhombus(row,stars);
	}
}
