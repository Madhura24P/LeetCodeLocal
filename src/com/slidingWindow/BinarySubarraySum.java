package com.slidingWindow;

public class BinarySubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,0,1,0,1};
		int goal=2;

	}
	
	 public int numSubarraysWithSum(int[] nums, int goal) {
		 
		 if(goal<=0)
		 {
			 return 0;
		 }
		 int count=subArraySumFunc(nums, goal) -subArraySumFunc(nums, goal-1);
		 return count;
		 
	        
	    }
	 
	 private int subArraySumFunc(int nums[],int goal)
	 {
		 int l=0,r=0,sum=0,count=0;
		 
		 while(r<nums.length)
		 {
			 sum+=nums[r];
			 
			 while(sum>goal && l<=r)
			 {
				 sum=sum-nums[l];
				 l++;
			 }
			 
			 count=count+(r-l+1);
			 r++;
		 }
		 
		 return count;
	 }

}
