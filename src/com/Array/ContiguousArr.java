package com.Array;

public class ContiguousArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findMaxLength(int[] nums) {
		 int max=0;
		 for(int i=0;i<nums.length-1;i++)
		 {
			 int j=i+1;
			 int zero=0;
			 if(nums[i]==0)
			 {
				 zero=1;
			 }
			 
			 while(j<nums.length)
			 {
				 if(nums[j]==0) {
					 zero++;
				 }
				 
				 
			 }
			 
			 if(zero==nums.length-zero)
			 {
				 max=Math.max(max, j-i+1);
			 }
		 }
	        
		 return max;
	    }

}
