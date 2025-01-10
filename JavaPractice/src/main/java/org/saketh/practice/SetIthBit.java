package org.saketh.practice;
import java.util.*;
public class SetIthBit {
	public static int set_ith_bit(int n, int i)
	{
		int bitMask = 1<<i;
		int output = n|bitMask;
		System.out.println(output);
		return output;
	}
}
