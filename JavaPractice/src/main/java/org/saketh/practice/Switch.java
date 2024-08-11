package org.saketh.practice;
import java.util.*;
public class Switch {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("1.Cofee\n2.Milk\n3.Tea\nEnter your choice: ");
		int choice = s.nextInt();
		switch (choice)
		{
		case 1:
			System.out.println("Here is your cofee!");
			break;
		case 2:
			System.out.println("Here is your milk!");
			break;
		case 3:
			System.out.println("Here is your tea!");
			break;
		default:
			System.out.println("Not Available!");
			break;
		}
			
	}
}
