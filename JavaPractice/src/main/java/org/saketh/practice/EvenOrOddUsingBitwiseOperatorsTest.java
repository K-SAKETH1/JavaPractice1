package org.saketh.practice;
import java.util.*;
public class EvenOrOddUsingBitwiseOperatorsTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		EvenOrOddUsingBitwiseOperators.odd_even(n);
	}
}
