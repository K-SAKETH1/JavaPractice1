package org.saketh.practice;
import java.util.*;
public class FastExponent {
	public static int fast_exponent(int a, int n)
	{
		int ans = 1;
		int bitMask = 1;
		while(n>0)
		{
			if((n&bitMask)!=0)
			{
				ans*=a;
			}
			a*=a;
			n = n>>bitMask;
		}
		return ans;
	}
}
