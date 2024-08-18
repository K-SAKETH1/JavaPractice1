package org.saketh.practice;
import java.util.*;
public class NumbersIncreasingPyramidTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		NumberIncreasingPyramid.number_increasing_pyramid(n);
	}
}
