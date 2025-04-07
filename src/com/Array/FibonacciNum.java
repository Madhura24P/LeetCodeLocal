package com.Array;

public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(4));

	}
	
	  public static int fib(int n) {
		  int sum=0;
		  if(n==0)
		  {
			  return 0;
		  }
		  if(n==1)
		  {
			  return 1;
		  }


			  sum=fib(n-1)+fib(n-2);
		  
		  System.out.println(sum);
	        return sum;
	    }
	  
	  public int fibDP(int n) {
	        // Dynamic programming array to store Fibonacci numbers
	        int[] dp = new int[n + 1];
	        dp[0] = 0;

	        if (n >= 1) {
	            dp[1] = 1;
	        }

	        // Fill the dp array using previously calculated Fibonacci numbers
	        for (int i = 2; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2];
	        }

	        // Return the nth Fibonacci number
	        return dp[n];
	    }

}
