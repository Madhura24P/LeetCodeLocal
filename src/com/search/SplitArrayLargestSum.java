package com.search;

import java.util.Arrays;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int splitArray(int[] nums, int k) {
		 
		 int low=Arrays.stream(nums).max().getAsInt();
		 int high=Arrays.stream(nums).sum();
		 
		 while(low<=high)
		 {
			 int mid=low+(high-low)/2;
			 if(sumSubArray(nums,mid)<=k)
			 {
				 high=mid-1;
			 }else
			 {
				 low=mid+1;
			 }
		 }
	        return low;
	    }
	 
	 private int sumSubArray(int[] nums,int maxSum)
	 {
		 int noOfSub=1;
		 int sum=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(sum+nums[i]<=maxSum)
			 {
				 sum=sum+nums[i];
				 
			 }else
			 {
				 sum=nums[i];
				 noOfSub++;
			 }
		 }
		 
		 
		 return noOfSub;
	 }

}
