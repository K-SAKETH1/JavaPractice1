package org.saketh.practice;

public class NumberChangingPyramid {
	public static void number_changing_pattern (int n)
	{
		int num =0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				num++;
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
}
