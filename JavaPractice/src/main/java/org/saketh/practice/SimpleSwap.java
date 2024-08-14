package org.saketh.practice;
import java.util.*;
public class SimpleSwap {
	public static void swap(int a, int b)
	{
		int temp = b;
		b = a;
		a = temp;
		System.out.println("a: "+a+"\nb: "+b);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = s.nextInt();
		System.out.print("Enter b value: ");
		int b = s.nextInt();
		swap(a,b);
		
	}
}
