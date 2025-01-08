package com.Array;

public class MissingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,0,1};
		missingNumber(a);

	}
	
	 public static int missingNumber(int[] nums) {
		 
		 int n=nums.length;
		 int sum=(n*(n+1))/2;
		 System.out.println(sum);
		 int s=0;
		 
		 for(int i=0;i<n;i++)
		 {
			 s=s+nums[i];
			 
		 }
		 System.out.println(s);
		 return sum-s;
	        
	    }

}
