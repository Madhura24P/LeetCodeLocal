package com.greedy;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
       int sum = 0;

       // Step 2: Add every even-indexed element (i.e., first of each pair)
       for (int i = 0; i < nums.length; i += 2) {
           sum += nums[i];
       }

       return sum;  // Step 3: Return the total sum of minimums6
       
   }

}
