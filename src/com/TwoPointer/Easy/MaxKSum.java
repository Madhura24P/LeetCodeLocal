package com.TwoPointer.Easy;

import java.util.Arrays;

public class MaxKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int maxOperations(int[] nums, int k) {
	
	Arrays.sort(nums);
	int left=0;
	int right=nums.length-1;
	int count=0;
	while(left<right)
	{
		if(nums[left]+nums[right]<k)
		{
			left++;
		}else if(nums[left]+nums[right]>k)
		{
			right--;
		}else
		{
			left++;
			right--;
			count++;
			
		}
	}
	
	return count;
	
        
    }

}
