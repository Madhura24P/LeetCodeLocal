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

}
