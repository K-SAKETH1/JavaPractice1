package org.saketh.practice;

public class MirrorImageTrianglePattern {
		public static void reverse_number_triangle(int n)
		{
			// first half
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
			//second half
			for(int i=2;i<=n;i++)
			{
				int count = n-i;
				for(int j=1;j<=count;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					count++;
					System.out.print(count+" ");
				}
				System.out.println();
			}
		}
}

