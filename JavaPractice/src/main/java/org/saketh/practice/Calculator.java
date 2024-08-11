package org.saketh.practice;
import java.util.*;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		double a = s.nextDouble();
		System.out.print("Enter the value of B: ");
		double b = s.nextDouble();
		System.out.print("Enter the operator: ");
		//We have added the charAt(0) to input a single character
		int operator = s.next().charAt(0);
		switch(operator)
		{
		case'+':
			System.out.println("Addition of A and B: "+(a+b));
			break;
		case'-':
			System.out.println("Subtraction of A and B: "+(a-b));
			break;
		case'*':
			System.out.println("Multiplication of A and B: "+(a*b));
			break;
		case'/':
			System.out.println("Division of A and B: "+(a/b));
			break;
		case'%':
			System.out.println("Modulus of A and B: "+(a%b));
			break;
		default:
			System.out.println("NA");
			break;
		}
	}
}
