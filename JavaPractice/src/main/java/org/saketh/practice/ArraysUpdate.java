package org.saketh.practice;
import java.util.*;
public class ArraysUpdate {
	public static void update(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			marks[i]++;
		}
	}
	public static void main(String[] args)
	{
		int marks[] = {98,99,100};
		update(marks);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
	}
}
