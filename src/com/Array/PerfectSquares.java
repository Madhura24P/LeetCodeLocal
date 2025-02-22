package com.Array;

import java.util.Arrays;

public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numSquares(6);

	}
	
	
	 public static int numSquares(int n) {
		 
		 int dp[]=new int[n+1];
		 
		  dp[0]=0;
		 		 
		 for(int i=1;i<n;i++)
		 {
			 dp[i]=i;
			 for(int j=1;j*j<i;j++)
			 {
				 dp[i]=Math.min(dp[i], 1+dp[i-j*j]);
				 
				 
			 }
			 
		 }
		 System.out.println(Arrays.toString(dp));
		 return dp[n];
	        
	    }

}
