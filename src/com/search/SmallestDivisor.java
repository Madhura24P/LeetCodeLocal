package com.search;

import java.util.Arrays;

public class SmallestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,5,9};
		int th=6;
		smallestDivisor(nums, th);
		

	}
	
	 public static int smallestDivisor(int[] nums, int threshold) {
		 
		 int max=Arrays.stream(nums).max().getAsInt();
		 int low=1;
		 int high=max;
		 int ans=-1;
		 while(low<=high)
		 {
			 int mid=low+(high-low)/2;
			 
			 if(calcSum(nums, mid)<=threshold)
			 {
				 ans=mid;
				 high=mid-1;
			 }else
			 {
				 low=mid+1;
			 }
		 }
		 
	        return low;
	    }
	 
	 private static int calcSum(int nums[],int div)
	 {
		 int sum=0;
		 for(int n:nums)
		 {
			 sum=sum+(int)Math.ceil((double)n/(double)div);
		 }
		 
		 return sum;
	 }

}
