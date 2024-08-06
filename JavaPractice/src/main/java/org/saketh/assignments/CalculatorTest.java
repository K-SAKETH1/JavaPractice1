package org.saketh.assignments;

class Calculator
{
	public static int getSum(int num1, int num2) {
		//implement logic
		return num1 + num2;		
	}
	public static int getSub(int num1, int num2) {
		//implement logic
		return num2 - num1;		//wrong
	}
	public static int getMul(int num1, int num2) {
		//implement logic
		return num1 * num2;
	}
	public static double getDiv(int num1, int num2) {
		//implement logic
		return (double) num1/num2;
	}
	public static double getModDiv(int num1, int num2) {
		//implement logic
		return num1%num2;
	}
	
}

public class CalculatorTest 
{
	public static void main(String args[])
	{
		int num1 = 10;
		int num2 = 20;
		System.out.println("Sum: " + Calculator.getSum(num1, num2));
		System.out.println("Sub: " + Calculator.getSub(num1, num2));
		System.out.println("Mul: " + Calculator.getMul(num1, num2));
		System.out.println("Div: " + Calculator.getDiv(num1, num2));
		System.out.println("ModDiv: " + Calculator.getModDiv(num1, num2));
		
	}
}
