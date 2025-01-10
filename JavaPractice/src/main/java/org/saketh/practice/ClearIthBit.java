package org.saketh.practice;
import java.util.*;
public class ClearIthBit {
	public static int clear_ith_bit(int n, int i)
	{
		int bitMask = 1<<i;
		int result = (n^bitMask);
		System.out.println(result);
		return result;
	}
	
}
