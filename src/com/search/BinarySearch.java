package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int search(int[] nums, int target) {
	
	   int low=0;
		int high=nums.length-1;

	    if(nums.length==1 && nums[0]==target)
	    {
	       return 0;
	    }
		
		while(low<high)
		{
			int mid=low+(high-low)/2;
			
			if(nums[mid]==target)
			{
				return mid;
			}else if(nums[mid]<target)
			{ 
				low=mid+1;
			}else
			{
				high=mid;
			}
		}

	    if(nums[low]==target)
	    {
	        return low;
	    }
		
	    return -1;
	//return low;
        
    }

public int searchOpt(int[] nums, int target) {
    int left = 0; // initialize left pointer to 0
    int right = nums.length - 1; // initialize right pointer to the last index of the array
    
    while (left <= right) { // continue the loop till left pointer is less than or equal to right pointer
        int mid = left + (right - left) / 2; // calculate the middle index of the array
        
        if (nums[mid] == target) { // check if the middle element is equal to target
            return mid; // return the middle index
        } else if (nums[mid] < target) { // check if the middle element is less than target
            left = mid + 1; // move the left pointer to the right of middle element
        } else { // if the middle element is greater than target
            right = mid - 1; // move the right pointer to the left of middle element
        }
    }
    
    return -1; // target not found in the array
}

}
