package com.slidingWindow;

public class CountNiceSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,1,2,1,1};
		int k=3;
		numSubarraysWithSum(nums, k);
		

	}
	
 public static  int numSubarraysWithSum(int[] nums, int goal) {
		 
		 if(goal<=0)
		 {
			 return 0;
		 }
		 int count=subArraySumFunc(nums, goal) -subArraySumFunc(nums, goal-1);
		 return count;
		 
	        
	    }
	 
	 private static int subArraySumFunc(int nums[],int goal)
	 {
		 int l=0,r=0,sum=0,count=0;
		 
		 while(r<nums.length)
		 {
			 sum+=(nums[r]%2);
			 
			 while(sum>goal && l<=r)
			 {
				 sum=sum-(nums[l]%2);
				 l++;
			 }
			 
			 count=count+(r-l+1);
			 r++;
		 }
		 
		 return count;
	 }

}
