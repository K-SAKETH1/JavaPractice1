package org.saketh.practice;
import java.util.*;
public class SpiralMatrix {
	public static void spiral_matrix(int arr[][])
	{
		int startRow=0;
		int startCol=0;
		int endRow = arr.length-1;
		int endCol = arr[0].length-1;
		while(startRow<=endRow&&startCol<=endCol)
		{
			//top
			for(int j=startCol;j<=endCol;j++)
			{
				System.out.print(arr[startRow][j]+" ");
			}
			//Right
			for(int i=startRow+1;i<=endRow;i++)
			{
				System.out.print(arr[i][endCol]+" ");
			}
			//bottom
			for(int j=endCol-1;j>=startCol;j--)
			{
				if(startRow==endRow)
				{
					break;
				}
				System.out.print(arr[endRow][j]+" ");
			}
			//left
			for(int i=endRow-1;i>=startRow+1;i--)
			{
				if(startCol==endCol)
				{
					break;
				}
				System.out.print(arr[i][startCol]+" ");
			} 
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
	}
}
