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
	}
}
