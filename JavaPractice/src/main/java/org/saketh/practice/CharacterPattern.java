package org.saketh.practice;
import java.util.*;
public class CharacterPattern {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of lines: ");
		int lines = s.nextInt();
		char ch = 'A';
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}
}
