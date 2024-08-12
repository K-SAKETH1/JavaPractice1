package org.saketh.practice;
import java.util.*;
public class ContinueStatementQuestion {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter number: ");
			int num = s.nextInt();
			if(num%10==0)
			{
				continue;
			}
			System.out.println(num);
		}
	}
}
