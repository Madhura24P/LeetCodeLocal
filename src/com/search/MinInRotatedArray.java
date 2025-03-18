package com.search;

public class MinInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {6,7,5,1,2,3,4};
		findMin(nums);

	}
	
	 public static int findMin(int[] nums) {
		 
		 int left=0;
		 int right=nums.length-1;
		 //int min=Integer.MAX_VALUE;
		 
		 while(left<right)
		 {
			 int mid=left+(right-left)/2;
			 if( nums[mid]<nums[right] )
			 {
				 
				right=mid;
				 
			 }else if(nums[mid]>nums[right])
			 {
				 left=mid+1;
			 }
		 }
		 
		 System.out.println(nums[left]);
		 return nums[left];
	        
	    }

}
