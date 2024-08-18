package org.saketh.practice;

public class KPattern {
	public static void k_pattern(int n)
	{
		//first half
		for(int i=n;i>0;i--)
		{
			for(int k=i;k>0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		for(int i=2;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
