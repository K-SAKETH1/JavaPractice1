package org.saketh.practice;
import java.util.*;
public class PassOrFail {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = s.nextInt();
		String result = (marks>=33)?"PASS":"FAIL";
		System.out.println("Your Result: "+result);
	}
}
