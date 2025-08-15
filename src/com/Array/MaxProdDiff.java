package com.Array;

import java.util.Arrays;

public class MaxProdDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int maxProductDifference(int[] nums) {
	
	Arrays.sort(nums);
	
	int diff=(nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
	
	return diff;
        
    }

}
