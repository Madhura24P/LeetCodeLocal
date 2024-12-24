package com.Array;

import java.util.Arrays;

public class PermutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,2,1,5,3,4};
				buildArray(nums);

	}
	
 public static int[] buildArray(int[] nums) {
	 int []res=new int[nums.length];
	 
	 for(int i=0;i<res.length;i++)
	 {
		 res[i]=nums[nums[i]];
	 }
	 
	 
	 System.out.println(Arrays.toString(res));
	 
	 return res;
        
    }

}
