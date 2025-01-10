package org.saketh.practice;
import org.saketh.practice.Pen.*;
public class Oops {
	public static void main(String args[])
	{
		Pen p1 = new Pen();
		p1.setColor("Blue");
		System.out.println(p1.color);
		p1.setTip(5);
		System.out.println(p1.tipSize);
		p1.color = "Yellow";
		System.out.println(p1.color);
		p1.tipSize = 6;
		System.out.println(p1.tipSize);
	}
}

