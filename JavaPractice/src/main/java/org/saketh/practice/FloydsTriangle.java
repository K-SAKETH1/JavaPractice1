package org.saketh.practice;
import java.util.*;
public class FloydsTriangle {
	public static void floyds_Triangle(int n)
	{
		int series = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(series + " ");
				series++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n = s.nextInt();
		floyds_Triangle(n);
		
	}
}
