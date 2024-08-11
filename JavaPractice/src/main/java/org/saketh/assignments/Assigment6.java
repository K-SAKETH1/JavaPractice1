package org.saketh.assignments;
import java.util.*;
public class Assigment6 {
	public static void main(String[] args)
	{
		/* Write a Java program to input week number(1-7)and print day of week name
 		using switch case*/
		Scanner s = new Scanner(System.in);
		System.out.print("Enter week number: ");
		int weekNumber = s.nextInt();
		switch(weekNumber)
		{
		case 1:
			System.out.println("It's Monday");
			break;
		case 2:
			System.out.println("It's Tuesday");
			break;
		case 3:
			System.out.println("It's Wednesday");
			break;
		case 4: 
			System.out.println("It's Thursday");
			break;
		case 5:
			System.out.println("It's Friday");
			break;
		case 6:
			System.out.println("It's Saturday");
			break;
		case 7:
			System.out.println("Its Sunday");
			break;
		default:
			System.out.println("Enter the correct week number");
			break;
		}
	}
}
