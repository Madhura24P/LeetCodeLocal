package com.slidingWindow;

public class MaxConsOnes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 public static int longestOnes(int[] nums) {
		 int k=1;
	 int n=nums.length;
	 if(n<2) return n;
	 
	 int L=0,R=0;
	 
	 int maxLen=0,counter=0;
	 
	 while(R<n)
	 {
		 if(nums[R]==0)
		 {
			 counter++;
		 }
		 
		 //contract window
		 while(counter>1)
		 {
			 if(nums[L]==0)
			 {
				 counter--;
			 }
			 L++;
		 }
		 
		 maxLen=Math.max(maxLen, R-L+1);
		 
		 R++;
	 }
	 
		return maxLen; 
	 }

}
