package com.TwoPointer.Easy;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(nums);

	}
	
	 public static int maxSubArray(int[] nums) {
		 
		 int currSum=0;
		 int maxSum=nums[0];
		 int n=nums.length;
		 
		 for(int i=0;i<n;i++)
		 {
			currSum=currSum+nums[i];
			if(currSum>maxSum)
			{
				maxSum=currSum;
			}
			
			if(currSum<0)
			{
				currSum=0;
			}
			 			 
		 }
		 
		 
		 
		 return maxSum;
	        
	    }

}
