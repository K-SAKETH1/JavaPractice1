package org.saketh.practice;
public class NumberIncreasingPyramid {
	public static void number_increasing_pyramid(int n)
	{
		for(int i=n;i>0;i--)
		{
			int count = i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
}
