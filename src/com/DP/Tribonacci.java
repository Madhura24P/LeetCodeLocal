package com.DP;

public class Tribonacci {
	int dp[]=new int[38];
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		Tribonacci t=new Tribonacci();
		t.tribonacci(n);
	}
	
	 public int tribonacci(int n) {
		 
		 if(n==0) 
			 { 
			 return dp[0];
			 }
		 
	 if(n==1|n==2) 
			 {
			 dp[n]=1;
			 return 1;
			 }
		 
		 if(dp[n]!=0)
		 {
			 return dp[n];
		 }
		 
		 int res=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
		 
		 return dp[n]=res;
	        
	    }

}
