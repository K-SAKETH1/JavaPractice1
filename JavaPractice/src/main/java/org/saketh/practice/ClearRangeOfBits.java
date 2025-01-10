package org.saketh.practice;
import java.util.*;
public class ClearRangeOfBits {
	public static void clear_range_of_bits(int n, int i, int j)
	{
		int a = -1<<(j+1);
		int b = (1<<i)-1;
		int bitMask = a|b;
		int result = n&bitMask;
		System.out.println(result);
	}
}
