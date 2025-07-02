package com.slidingWindow;

public class MaxAvgSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public double findMaxAverage(int[] nums, int k) {
		 int sum=0;
		
	     for(int i=0;i<k;i++)
		 {
			 sum=sum+nums[i];
		 }
	     int maxSum=sum;
		 
		 for(int i=k;i<nums.length;i++)
		 {
			 sum=sum-nums[i-k]+nums[i];
			 if(sum>maxSum)
			 {
				 maxSum=sum;
			 }
		 }
	        
		 double avg=(double)maxSum/k;
		 return avg;
	    }

}
