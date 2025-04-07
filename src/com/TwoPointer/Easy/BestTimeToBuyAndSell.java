package com.TwoPointer.Easy;

public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []prices = {7,1,5,3,6,4};
		maxProfit(prices);

	}
	
	 public static int maxProfit(int[] prices) {
		 
		 int buy=Integer.MAX_VALUE;
		 int profit=Integer.MIN_VALUE;
		 for(int p:prices)
		 {
			 if(p<buy)
			 {
				 buy=p;
			 }else
			 {
				 profit=Math.max(profit, p-buy);
			 }
		 }
		 
		 System.out.println("Max:"+profit);
		 
		 return profit;
	        
	    }

}
