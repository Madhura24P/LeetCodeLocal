package com.slidingWindow;

public class MaxConsOne_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int longestOnes(int[] nums, int k) {

	     int max=Integer.MIN_VALUE;
		int currMax=0;
		int kcopy=k;
		int count=0;
		int apt=0;
		int bpt=0;
		while(apt<=bpt && bpt<nums.length)
		{
			if(nums[bpt]==1 || count<k)
			{
				currMax++;
				if(nums[bpt]==0)
				{
				count++;
				}
				//k--;
			}else
			{
				System.out.println(currMax);
				max=Math.max(max, currMax);
				count=0;
				bpt=apt+1;
	            apt++;
				currMax=0;
				continue;
				//k=kcopy;
				
			}
			
			bpt++;
			
		}
		
		max=Math.max(max, currMax);
		System.out.println(max);
		return max;


	   }


}
