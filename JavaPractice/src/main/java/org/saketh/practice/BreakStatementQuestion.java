package org.saketh.practice;
import java.util.*;
public class BreakStatementQuestion {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter the number: ");
			int num = s.nextInt();
			if(num%10==0)
			{
				break;
			}
			System.out.println(num);
		}
		System.out.println("You have entered a 10 multiple");
	}
}
