package org.saketh.practice;
import java.util.*;
public class CountNoOfSetBits {
	public static void no_of_setbits(int n)
	{
		int bitMask = 1;
		int count = 0;
		while(n>0)
		{
			if((n&bitMask)!=0)
			{
				count++;
			}
//			n/=2;
			n = n>>bitMask;
		}
		System.out.println(count);
	}
}
