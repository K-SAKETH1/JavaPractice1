package org.saketh.practice;
import java.util.*;
public class WhileLoops {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of times to print 'Hello World': ");
		int num = s.nextInt();
		int count = 0;
		while(count<num)
		{
			System.out.println("Hello World");
			count++;
		}
		System.out.println(count);
	}
}
