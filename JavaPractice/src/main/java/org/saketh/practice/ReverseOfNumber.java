package org.saketh.practice;
import java.util.*;
public class ReverseOfNumber {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any digit: ");
		int digit = s.nextInt();
		while(digit>0)
		{
			int lastDigit = digit%10;
			System.out.print(lastDigit);
			digit/=10;
		}
	}
}
