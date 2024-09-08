package org.saketh.practice;
import java.util.*;
public class SubstringsTest {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str = s.nextLine();
		Substrings.sub_string(str);
		//inbuilt function
		System.out.println(str.substring(0,6));
	}
}
