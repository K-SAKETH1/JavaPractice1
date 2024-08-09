package org.saketh.practice;
import java.util.*;
public class TypeCasting {
	// java doesn't convert float => integer implicitly but we try to convert it explicitly
	public static void main (String[] args)
	{
		//method1
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your float number: ");
		float printFloat = s.nextFloat();
		System.out.println("Float: "+printFloat);
		int printInteger = (int) printFloat;
		System.out.println("Integer: "+printInteger);
		//method2
		System.out.print("Enter your float number: ");
		int printInteger1 = (int) (s.nextFloat());
		System.out.println("Integer: "+printInteger1);
		//Method3 for characters
		char c1 = 'a';
		char c2 = 'b';
		int charToInteger = (int) c1;
		int charToInteger1 = (int) c2;
		System.out.println("'a' as integer: "+charToInteger);
		System.out.println("'b' as integer: "+charToInteger1);
	}
}
