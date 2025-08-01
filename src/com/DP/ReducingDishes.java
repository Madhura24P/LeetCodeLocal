package com.DP;

import java.util.Arrays;

public class ReducingDishes {
	
	int n;
	int dp[][]=new int[501][501];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int maxSatisfaction(int[] satisfaction) {
		  n=satisfaction.length;
          for(int[] rows : dp){
              Arrays.fill(rows, -1);
             }  
  		  int max=0;
  		  max=helper(satisfaction,0,1);
  		  return max;	        
	    }
	  
	  
	  public int helper(int[]satisfaction,int i,int t)
	  {
		  if(i>=n)
		  {
			  return 0;
		  }
		  if(dp[i][t]!=-1)
		  {
			  return dp[i][t];
		  }
		  
		  int include=satisfaction[i]*t+helper(satisfaction,i+1,t+1);
		  int exclude=helper(satisfaction,i+1,t);
		  
		  dp[i][t]=Math.max(include, exclude);
		  
		  return dp[i][t];
	  }

}
