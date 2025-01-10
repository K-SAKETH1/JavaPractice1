package org.saketh.practice;
import java.util.*;
public class CheckIfANumberIsPowerOf2 {
	public static void chechif_power_of_2(int n)
	{
		if((n&(n-1))==0)
		{
			System.out.println(n+" is power of 2");
		}
		else
		{
			System.out.println(n+" is not a power of 2");
		}
	}
}
