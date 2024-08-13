package org.saketh.assignments;
import java.util.*;
public class Assignment12 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int num = s.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + " * " + i + " = "+num * i);
		}
	}
}
