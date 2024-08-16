package org.saketh.assignments;
import java.util.*;
public class Assignment14 {
	public static boolean isEven()
	{
		//Even or not
		boolean isEven;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = s.nextInt();
		if(n%2==0)
		{
			isEven = true;
		}
		else {
			isEven = false;
		}
		return isEven;
	}
	public static void main(String[] args)
	{
		if(isEven())
		{
			System.out.println("It's even");
		}
		else
		{
			System.out.println("It's odd");
		}
	}
}
