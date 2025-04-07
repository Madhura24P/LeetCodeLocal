package com.TwoPointer.Easy;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7};
		RotateArray a=new RotateArray();
		a.rotate(nums, 3);
	}

	 public void rotate(int[] nums, int k) {
		 //k>num.length k=k%num.length
		 rev(nums,0,nums.length-1);
		 System.out.println(Arrays.toString(nums));
		 rev(nums,0,k-1);
		 System.out.println(Arrays.toString(nums));
		 rev(nums,k,nums.length-1);
		 System.out.println(Arrays.toString(nums));
	        
	    }
	 
	 
	 private void rev(int nums[],int s,int e)
	 {
		 
		 int apt=s;
		 int bpt=e;
		 
		 while(apt<=bpt)
		 {
			 int temp=nums[apt];
			 nums[apt]=nums[bpt];
			 nums[bpt]=temp;
			 apt++;
			 bpt--;
		 }
		 
	 }
}
