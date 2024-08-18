package org.saketh.practice;
public class SecondDiamondPattern {
	public static void diamond_pattern(int n)
	{
		//first half
		for(int i=1;i<=n;i++)
		{
			//spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		for(int i=n-1;i>0;i--)
		{
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
