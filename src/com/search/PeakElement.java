package com.search;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {6,5,4,3,2,3,2};
		//int nums[]= {1,2,3,2};
		int nums[]= {3,2,1};
		findPeakElement(nums);
		
        //		

	}
	
public static int findPeakElement(int[] nums) {
	
	int low=0;
	int high=nums.length-1;
	
	while(low<high)
	{
		int mid=low +(high-low)/2;
		
		if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
		{
			
			return mid;
		}else if(nums[mid]<nums[mid+1] || nums[mid]<nums[mid-1])
		{ 
			low=mid;
		}else if(nums[mid]>nums[mid+1])
		{
			high=mid;
		}
	}
	
	return low;
        
    }

}
