package org.saketh.practice;
import java.util.*;
public class ReverseStarPattern {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of lines: ");
		int lines = s.nextInt();
		for(int i=lines;i>0;i--)
		{
			for(int j=i; j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
