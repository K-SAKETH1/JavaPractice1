package org.saketh.practice;
import java.util.*;
public class FastExponentTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a = s.nextInt();
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.println(FastExponent.fast_exponent(a, n));
	}
}
