package org.saketh.practice;
import java.util.*;
public class TrappingRainWater {
	public static int trapped_water(int height[],int width)
	{
		//left-max auxiliary array
		int leftMax[] = new int[height.length];
		//first element of leftMax is first element of height
		leftMax[0] = height[0];
		//for loop starting from 1 because 0th element is initialized
		for(int i=1;i<height.length;i++)
		{
			//Each and every maximum element is stored at i-th index here leftMax previous element is compared with height current element
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		//right-max auxiliary array
		int rightMax[] = new int[height.length];
		//As it is right we come from the right side, so last element of rightMax is last element of height
		rightMax[height.length-1] = height[height.length-1];
		//for loop starting from length-2 as length-1 is already initialized running in reverse as we are coming from right side
		for(int i = height.length-2;i>=0;i--)
		{
			//As last element is initialized we compare the i+1 element with height current element
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		int trapWater = 0;
		for(int i=0;i<height.length;i++)
		{
			int waterLevel = Math.min(leftMax[i], rightMax[i]);
			trapWater+=(waterLevel-height[i])*width;
		}
		return trapWater;	
	}
}
