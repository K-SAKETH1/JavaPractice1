package org.saketh.assignments;
import java.util.*;
public class Assignment2 {
	/*In a program, input the side of a square. You have to output the area of the
 square*/
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter side of a square: ");
		int side = s.nextInt();
		int area = side*side;
		System.out.println("Area of the square: "+area);
	}
}
