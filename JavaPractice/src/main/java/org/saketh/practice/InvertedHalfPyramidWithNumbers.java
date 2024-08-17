package org.saketh.practice;
import java.util.*;
public class InvertedHalfPyramidWithNumbers {
	public static void inverted_half_pyramid_with_numbers(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int n = s.nextInt();
		inverted_half_pyramid_with_numbers(n);
	}
}
