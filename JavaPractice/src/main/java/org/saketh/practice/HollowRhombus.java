package org.saketh.practice;
import java.util.*;
public class HollowRhombus {
	public static void hollow_rhombus(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=n;k++)
			{
				if(i==1||i==n||k==1||k==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n = s.nextInt();
		hollow_rhombus(n);
	}
}
