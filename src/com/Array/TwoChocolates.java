package com.Array;

import java.util.Arrays;
import java.util.Comparator;

public class TwoChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int buyChoco(int[] prices, int money) {
		 
		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
		for(int n:prices)
		{
			if(n<min)
			{
				smin=min;
				min=n;
			}else if(n<smin)
			{
				smin=n;
			}
		}
		
		if(money>=(min+smin))
		{
			return (money-(min+smin));
		}
	        return money;
	    }

}
