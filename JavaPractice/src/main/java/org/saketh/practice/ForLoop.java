package org.saketh.practice;
import java.util.*;
public class ForLoop {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
