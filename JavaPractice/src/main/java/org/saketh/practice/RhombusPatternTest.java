package org.saketh.practice;
import java.util.*;
public class RhombusPatternTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int row = s.nextInt();
		System.out.print("Enter no of stars: ");
		int stars = s.nextInt();
		RhombusPattern.rhombus_pattern(row, stars);
	}
}
