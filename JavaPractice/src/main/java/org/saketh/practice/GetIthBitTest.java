package org.saketh.practice;
import java.util.*;
public class GetIthBitTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.print("Enter i value to show ith bit of n: ");
		int i = s.nextInt();
		System.out.println(GetIthBit.get_ith_bit(n, i));
	}
}
