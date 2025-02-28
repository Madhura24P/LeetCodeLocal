package com.Array;

public class CanArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean canSortArray(int[] nums) {
		 
		 for(int i=0;i<nums.length-2;i++)
		 {
			 for(int j=i+1;j<nums.length;j++)
			 {
				 
				 if(nums[j-1]>nums[j] && countBits(nums[j-1])==countBits(nums[j]))
				 {
					 int temp=nums[j-1];
					 nums[j-1]=nums[j];
					 nums[j]=temp;
					 
				 }
				 
			 }
		 }
		 
		 
		 for(int i=0;i<nums.length-1;i++)
		 {
			 if(nums[i]>nums[i+1])
			 {
				 return false;
			 }
		 }
	        
		 return true;
	    }
	 
	 private int countBits(int num)
	 {
		 int count=0;
		 
		 while(num!=0)
		 {
			 count+=(num & 1);
			 num>>=1;
		 }
		 
		 return count;
	 }
	 
	 

}
