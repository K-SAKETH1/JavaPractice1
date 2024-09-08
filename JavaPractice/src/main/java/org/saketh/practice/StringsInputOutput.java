package org.saketh.practice;
import java.util.*;
public class StringsInputOutput {
	public static void main(String[] args)
	{
		int arr[] = {'a','b','c','d'};
		String str = "abcde";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
//		String name = s.next();//Only One Word Is Read
		String name = s.nextLine();//To Read Whole Sentence
		System.out.println(name);
		//LENGTH FUCTION
		System.out.println("Length: "+name.length());
	}
}
