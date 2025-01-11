package com.search;

public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {1,3,5,6};
		searchInsert(n, 5);
		

	}
	
	 public static int searchInsert(int[] nums, int target) {
		 


		 int start=0;
		 int end=nums.length-1;
		 
		 while(start<=end)
		 {
			 int mid=start+(end-start)/2;
			 
			 if(nums[mid]==target)
			 {
				 return mid;
			 }else if(nums[mid]>target)
			 {
				 end=mid;
			 }else
			 {
				 start=mid+1;
			 }
		 }
		 
		 
			 return end;
		
	       
	    }

}
