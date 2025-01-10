package org.saketh.practice;
import java.util.*;
public class EvenOrOddUsingBitwiseOperators {
	public static void odd_even(int n)
	{
		int bitMask = 1;
		if((n & bitMask) == 0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
	}
}
