package org.saketh.practice;
import java.util.*;
public class CustomerOrders {
	public static void orders()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your order: ");
		String order = s.nextLine();
		String arr[] = HotelMenu.items_menu();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(arr[i]==order)
			{
				System.out.println("Your order will served");
				break;
			}
			else
			{
				System.out.println("Sorry Not Available");
				break;
			}
		}
	}
}
