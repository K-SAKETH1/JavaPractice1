package org.saketh.practice;
import java.util.*;
public class DoWhileLoop {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int count = 1;
		int n = s.nextInt();
		do
		{
			System.out.println(count);
			count++;
		}while(count<=n);
	}
}
