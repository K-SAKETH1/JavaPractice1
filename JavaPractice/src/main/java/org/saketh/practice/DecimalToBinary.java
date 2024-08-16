package org.saketh.practice;
import java.lang.Math;
import java.util.*;
public class DecimalToBinary {
	public static int decimalToBinary(int n)
	{
		int binary = 0;
		int pow = 0;
		while(n>0)
		{
			int remainder = n%2;
			binary+=(remainder*Math.pow(10, pow));
			n/=2;
			pow++;
		}
		return binary;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any decimal number: ");
		int dec = s.nextInt();
		System.out.println(dec+" in binary: "+decimalToBinary(dec));
	}
}
