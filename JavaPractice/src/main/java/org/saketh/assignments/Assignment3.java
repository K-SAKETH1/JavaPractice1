package org.saketh.assignments;
import java.util.*;
public class Assignment3 {
	/*
	  Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 	  an eraser. You have to output the total cost of the items back to the user as their bill.
	*/
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the cost of a pencil: ");
		float pencilCost = s.nextFloat();
		System.out.print("Enter the cost of a pen: ");
		float penCost = s.nextFloat();
		System.out.print("Enter the cost of a eraser: ");
		float eraserCost = s.nextFloat();
		float bill = pencilCost + penCost + eraserCost;
		System.out.println("Total Bill: "+bill);
		
	}
}
