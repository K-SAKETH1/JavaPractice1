package org.saketh.practice;
import java.util.Scanner;
public class LinearSearch {
	public static void linear_search(int arr[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter key value: ");
		int key = s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key+" is available at index: "+i);
				break;
			}
			else
			{
				System.out.println(key+" does not exist");
				break;
			}
		}
	}
}
