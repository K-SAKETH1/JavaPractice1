package org.saketh.practice;

public class PalindromeTriangularPyramid {
	public static void palindrome_triangle_pyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{	
			
			int num = 0;
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=i;k>0;k--)
			{
				System.out.print(k+" ");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
