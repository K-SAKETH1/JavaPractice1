package org.saketh.assignments;
import java.util.*;
public class Assignment5 {
	public static void main(String[] args)
	{
		/* You have a fever if your temperature
 		is above 100 and otherwise prints You don't have a fever */
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your body temperature: ");
		double temperature = s.nextDouble();
		if(temperature>=100)
		{
			System.out.println("You have a fever");
		}
		else
		{
			System.out.println("You don't have a fever");
		}
	}
}
