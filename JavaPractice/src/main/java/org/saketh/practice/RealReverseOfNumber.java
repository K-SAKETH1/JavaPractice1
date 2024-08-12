package org.saketh.practice;
import java.util.*;
public class RealReverseOfNumber {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int digit = s.nextInt();
		int reverse = 0;
		while(digit>0)
		{
			int lastDigit = digit%10;
			reverse = (reverse*10) + lastDigit;
			digit/=10;
		}
		System.out.println("Reverse of the digit is : "+reverse);
	}
}
