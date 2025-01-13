package org.saketh.practice;
import org.saketh.practice.Fish.*;
import org.saketh.practice.Dog.*;
public class Inheritence {
	public static void main(String args[])
	{
		//Single level inheritance
		Fish shark = new Fish();
		shark.eat();
		shark.color = "Blue";
		shark.swims();
		//Multilevel inheritance
		Dog suri = new Dog();
		suri.breed = "lab";
		System.out.println(suri.breed);
		suri.legs = 4;
		System.out.println(suri.legs);
		suri.eat();
	}
}
