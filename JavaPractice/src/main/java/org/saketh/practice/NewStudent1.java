package org.saketh.practice;

public class NewStudent1 {
	String name;
	int roll;
	int marks[] = new int[3];
	NewStudent1(NewStudent1 s1) //Deep copy
	{
		this.name = s1.name;
		this.roll = s1.roll;
		for(int i=0;i<3;i++)
		{
			this.marks[i] = s1.marks[i];
		}
	}
	NewStudent1()
	{
		
	}
}
