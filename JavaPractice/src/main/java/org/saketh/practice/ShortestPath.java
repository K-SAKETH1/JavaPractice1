package org.saketh.practice;
import java.util.*;
public class ShortestPath {
	public static void shortest_path(String path)
	{
		int x1 = 0;
		int y1 = 0;
		int x2=0;
		int y2=0;
		for(int i=0;i<path.length();i++)
		{
			if(path.charAt(i)=='N')
			{
				y2++;
			}
			else if(path.charAt(i)=='S')
			{
				y2--;
			}
			else if(path.charAt(i)=='E')
			{
				x2++;
			}
			else if(path.charAt(i)=='W')
			{
				x2--;
			}
			else
			{
				System.out.println("Enter correct directions");
				break;
			}
		}
		double displacement = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Shortest path: "+displacement);
	}
}
