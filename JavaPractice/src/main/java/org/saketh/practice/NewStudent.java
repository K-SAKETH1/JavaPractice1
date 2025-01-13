package org.saketh.practice;

public class NewStudent {
	String name;
	int roll;
	int marks[] = new int[3];
	NewStudent(NewStudent s1) //shallow copy
	{
		this.name = s1.name;
		this.roll = s1.roll;
		this.marks = s1.marks;
	}
	NewStudent()
	{
		
	}
}
