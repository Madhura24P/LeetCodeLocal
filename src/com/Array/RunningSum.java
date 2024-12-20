package com.Array;

import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,4};
		runningSum(nums);

	}
	
public static int[] runningSum(int[] nums) {
	int res[]=new int[nums.length];
	int sum=0;
	
	for(int i=0;i<nums.length;i++)
	{
		nums[i]=sum+nums[i];
		sum=nums[i];
	}
	
	System.out.println(Arrays.toString(nums));
	return res;
        
    }

}
