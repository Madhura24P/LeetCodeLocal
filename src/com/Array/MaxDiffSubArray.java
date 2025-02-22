package com.Array;

import java.util.Arrays;

public class MaxDiffSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int[][] divideArray(int[] nums, int k) {
	
	  int res[][]=new int[nums.length/3][3];
	int j=0;
	
	Arrays.sort(nums);
	for(int i=1;i<nums.length-1;i=i+3)
	{
		if(nums[i]-nums[i-1]<=k && nums[i+1]-nums[i]<=k && nums[i+1]-nums[i-1]<=k)
		{
			res[j][0]=nums[i-1];
			res[j][1]=nums[i];
			res[j][2]=nums[i+1];
           j++;
		}else
		{
           
           return new int[0][0];
		}
		
	}
	
	return res;
        
    }

//_AMO3390
//AMO3398
//AMO3418
//AMO3431
//amo3449/
//amo3477
//amo3565
//pam1785---skip
//73 
//pam1748
//pam1700--wide
//_pam1670
//_pam1824
}
