package org.saketh.practice;
import java.util.*;
public class BinaryToDecimal {
	
	public static int decimal(int binary)
	{
		int decimal = 0;
		int lastDigit = 0;
		int pow = 0;
		while(binary>0)
		{
			lastDigit = binary%10;
			decimal += (lastDigit * Math.pow(2,pow));
			binary/=10;
			pow++;
		}
		return decimal;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		int binary = s.nextInt();
		System.out.println("In Binary: "+decimal(binary));
	}
}
