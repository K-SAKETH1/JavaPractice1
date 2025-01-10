package org.saketh.practice;
import org.saketh.practice.BankAccount.*;
public class AccessModifiers {
	public static void main(String args[])
	{
		BankAccount b1 = new BankAccount();
		b1.userName = "Saketh";
//		b1.password = "abc"; -> this will show an error cause the variable access modifier is private
		b1.setPassword("abc");
		System.out.println(b1.userName);
//		System.out.println(b1.password); we can't access
	}
}
