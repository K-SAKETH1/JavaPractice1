package org.saketh.practice;
import org.saketh.practice.PrivateBankAccount.*;
public class GetSetThis {
	public static void main(String args[])
	{
		PrivateBankAccount b1 = new PrivateBankAccount();
		b1.setUserName("Saketh");//Setting username
		b1.setPassword("abc");
		System.out.println(b1.getUserName());
		System.out.println(b1.getPassword());
	}
}
