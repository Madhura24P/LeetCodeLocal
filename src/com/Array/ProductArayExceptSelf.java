package com.Array;

import java.util.Arrays;

public class ProductArayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4};
		productExceptSelf(nums);

	}
	
	 public static int[] productExceptSelf(int[] nums) {
		 int [] res=new int[nums.length];
		 Arrays.fill(res, 1);
		 //int index=0;
		 
			/*
			 * for(int n1:nums) { int
			 * prod=productPref(nums,index-1)*productSuff(nums,index+1); res[index]=prod;
			 * index++; }
			 */
	     int curr=1;
		 for(int i=0;i<nums.length;i++)
		 {
			 res[i]*=curr;
			 curr*=nums[i];
			 
		 }
		
		  curr=1;
		 for(int i=(nums.length-1);i>=0;i--)
		 {
			 res[i]*=curr;
			 curr*=nums[i];
			 
		 }
		 
		 
		 System.out.println(Arrays.toString(res));
		 return res;
	        
	    }
	 
	 public static int productPref(int nums[],int index)
	 {
		 int prod=1;
		while(index>=0)
		{
			prod=prod*nums[index];
			index--;
		}
		return prod;
	 }
	 
	 public static int productSuff(int nums[],int index)
	 {
		 int prod=1;
		while(index<nums.length)
		{
			prod=prod*nums[index];
			index++;
		}
		return prod;
	 }

}
