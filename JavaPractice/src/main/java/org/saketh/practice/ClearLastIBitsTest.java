package org.saketh.practice;
import java.util.*;
public class ClearLastIBitsTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		System.out.print("Enter i value: ");
		int i = s.nextInt();
		System.out.println(ClearLastIBits.clear_i_bits(n, i));
	}
}
