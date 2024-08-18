package org.saketh.practice;

public class RhombusPattern {
	public static void rhombus_pattern(int rows, int stars)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=stars;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
