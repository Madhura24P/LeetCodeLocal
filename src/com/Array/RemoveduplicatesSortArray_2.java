package com.Array;

import java.util.Arrays;

public class RemoveduplicatesSortArray_2 {
	
	public static void main(String[] args) {
		int[] nums= {1,1,1,2,3,3};
		int k=removeDuplicates(nums);
		System.out.println(k);
	
	}
	
	 public static int removeDuplicates(int[] nums) {
		 
		 int count=1;
		 int sl=0;
		 int ft=2;
		 while( ft<nums.length && sl<nums.length)
		 {
			 if(nums[sl]!=nums[ft])
			 {
				 nums[ft]=nums[sl];
				 count++;
				 sl=sl++;
				 ft=ft++;
			 }
			 else
			 {
				 sl=++sl;
			 }
		 }
				 System.out.println(Arrays.toString(nums));
		 
		 
		 return   count;
	        
	    }

}
