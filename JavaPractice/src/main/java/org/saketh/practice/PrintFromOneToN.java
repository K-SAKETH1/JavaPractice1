package org.saketh.practice;
import java.util.*;
public class PrintFromOneToN {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		int count = 1;
		int sum = 0;
		while(count<=n)
		{
			System.out.println(count);
			count++;
			
		}
	}
}
