package org.saketh.practice;
import java.util.*;
public class UpdateIthBit {
	public static int update_ith_bit(int n, int i, int newBit)
	{
		//first approach
//		if(newBit==0)
//		{
//			return ClearIthBit.clear_ith_bit(n, i);
//		}
//		else
//		{
//			return SetIthBit.set_ith_bit(n, i);
//		}
		n = ClearIthBit.clear_ith_bit(n, i);
		int bitMask = newBit<<i;
		return n|bitMask;
	}
}
