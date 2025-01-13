package org.saketh.practice;
import org.saketh.practice.NewStudent1.*;
public class DeepCopyConstructor {
	public static void main(String args[])
	{
		NewStudent1 s1 = new NewStudent1();
		s1.name = "Saketh";
		s1.roll = 70;
		s1.marks[0] = 90;
		s1.marks[1] = 100;
		s1.marks[2] = 80;
		NewStudent1 s2 = new NewStudent1(s1);
		s2.marks[0] = 100;
		for(int i=0;i<3;i++)
		{
			System.out.println(s2.marks[i]);
		}
	}
}
