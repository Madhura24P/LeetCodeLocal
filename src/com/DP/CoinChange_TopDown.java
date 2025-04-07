package com.DP;

public class CoinChange_TopDown {
	int[] coins;
	Integer[] cache;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int coinChange(int[] coins, int amount) {
	this.coins=coins;
	this.cache=new Integer[amount+1];
	
	return helper(amount);
        
    }

private int helper(int amount)
{
	if(amount==0)
     return 0;
	
	if(amount<0) return -1;
	
	if(cache[amount]!=null) return cache[amount];
	
	int minCoins=Integer.MAX_VALUE;
	
	for(int n:coins)
	{
		int currMin=helper(amount-n);
		if(currMin!=-1)
		{
			minCoins=Math.min(currMin, minCoins);
		}
	}
	
	if(minCoins==Integer.MAX_VALUE)
	{
		minCoins=-1;
	}else
	{
		minCoins=minCoins+1;
	}
	
	cache[amount]=minCoins;
	
	return cache[amount];
}

}
