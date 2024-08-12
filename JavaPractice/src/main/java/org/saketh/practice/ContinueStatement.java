package org.saketh.practice;
import java.util.*;
public class ContinueStatement {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
