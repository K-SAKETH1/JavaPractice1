package org.saketh.practice;

public class ReverseNumberTriangle {
	public static void reverse_number_triangle(int n)
	{
		for(int i=n;i>0;i--)
		{
			int count = n-i;
			for(int k=1;k<=count;k++)
			{
				System.out.print(" ");			
			}
			for(int j=i;j>0;j--)
			{
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
