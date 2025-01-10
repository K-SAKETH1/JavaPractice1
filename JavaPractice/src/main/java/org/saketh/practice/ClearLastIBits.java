package org.saketh.practice;
import java.util.*;
public class ClearLastIBits {
	public static int clear_i_bits(int n, int i)
	{
		int bitMask = -1<<i;
		int result = n&bitMask;
		return result;
	}
}
