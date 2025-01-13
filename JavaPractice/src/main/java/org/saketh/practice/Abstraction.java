package org.saketh.practice;
import org.saketh.practice.Horse.*;
import org.saketh.practice.AbstractAnimal.*;
import org.saketh.practice.Chicken.*;
public class Abstraction {
	public static void main(String args[])
	{
		Horse h = new Horse();
		h.eat();
		h.walk();
		Chicken c = new Chicken();
		c.eat();
		c.walk();
	}
}
