package org.saketh.practice;
import java.util.*;
public class TrappingRainWaterTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter width of the bar: ");
		int width = s.nextInt();
		System.out.println(TrappingRainWater.trapped_water(ArraysInput.input_array(), width));
	}
}
