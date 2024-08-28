package org.saketh.practice;
import java.util.*;
public class BuyAndSellStocks {
	public static void buy_sell_stocks(int prices[])
	{
		//finding min
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i=1;i<prices.length;i++)
		{
			if(minPrice<prices[i])
			{
				int profit = prices[i]-minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
			else
			{
				minPrice = prices[i];
			}
		}
		System.out.println("Buying Price: "+minPrice+"\nProfit: "+maxProfit);	  
	}
}
