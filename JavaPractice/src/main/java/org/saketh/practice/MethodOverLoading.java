package org.saketh.practice;
import org.saketh.practice.MethodOverLoadingCalculator.*;
public class MethodOverLoading {
	public static void main(String args[])
	{
		MethodOverLoadingCalculator calc = new MethodOverLoadingCalculator();
		System.out.println(calc.sum(1,3));
		//Below the values are type casted because java as default it takes  decimals as double
		System.out.println(calc.sum((float)1.5,(float)2.3));
		System.out.println(calc.sum(1,2,3));
	}
}
