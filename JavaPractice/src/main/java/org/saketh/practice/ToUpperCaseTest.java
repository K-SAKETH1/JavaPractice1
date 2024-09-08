package org.saketh.practice;
import java.util.*;
public class ToUpperCaseTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any phrase: ");
		String str = s.nextLine();
		StringBuilder sbr = new StringBuilder(str);
		ToUpperCase.to_uppercase(sbr);
	}
}
