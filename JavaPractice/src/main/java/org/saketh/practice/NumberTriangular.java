package org.saketh.practice;
public class NumberTriangular {
	public static void number_pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			//Spaces
			for(int j=1; j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//numbers
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
