package org.saketh.practice;
import java.util.*;
public class ClearRangeOfBitsTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.print("Enter i value: ");
		int i = s.nextInt();
		System.out.print("Enter j value: ");
		int j = s.nextInt();
		ClearRangeOfBits.clear_range_of_bits(n, i, j);
	}
}
