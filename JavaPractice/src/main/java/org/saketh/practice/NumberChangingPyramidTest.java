package org.saketh.practice;
import java.util.*;
public class NumberChangingPyramidTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		NumberChangingPyramid.number_changing_pattern(n);
	}
}
