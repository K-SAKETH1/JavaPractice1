package org.saketh.practice;
import java.util.*;
public class GetIthBit {
	public static int get_ith_bit(int n, int i)
	{
		int bitMask = 1<<i;
		if((n&bitMask)==0)
		{
			return 0;
		}
		return 1;
	}
}
