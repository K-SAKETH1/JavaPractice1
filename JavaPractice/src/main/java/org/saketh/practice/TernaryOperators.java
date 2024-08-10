package org.saketh.practice;
import java.util.*;
public class TernaryOperators {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = s.nextInt();
		System.out.print("Enter the value of B: ");
		int b = s.nextInt();
		int larger = (a>b)?a:b;
		System.out.println("Larger Number Is: "+larger);
		//Even or odd
		String type = (a%2==0)?"even":"odd";
		String type1 = (b%2==0)?"even":"odd";
		System.out.println("A is: "+type);
		System.out.println("B is: "+type1);
	}
}
