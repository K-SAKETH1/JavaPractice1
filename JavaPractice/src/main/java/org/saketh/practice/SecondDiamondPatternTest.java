package org.saketh.practice;
import java.util.*;
public class SecondDiamondPatternTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		SecondDiamondPattern.diamond_pattern(n);
	}
}
