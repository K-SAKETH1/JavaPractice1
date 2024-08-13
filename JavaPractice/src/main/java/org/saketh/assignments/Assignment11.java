package org.saketh.assignments;
import java.util.Scanner;
public class Assignment11 {
	 public static void main(String[] args) 
	 {
		 Scanner s = new Scanner(System.in); // To hold factorial
		 System.out.print("Enter any positive integer: ");
		 int num = s.nextInt();
		 int fact = 1;
		 for(int i=1; i<=num; i++) 
		 {
			 fact *= i;
		 }
		 System.out.println("Factorial: "+ fact);
	} 
}
