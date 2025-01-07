package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int maximumProduct(int[] nums) {
	
	int p=Integer.MIN_VALUE;
	Arrays.sort(nums);
	int n=nums.length-1;
	int aPt=0;
	int bPt=aPt+1;
	
   while(bPt<nums.length-1)
   {
	  
	  p=Math.max(p,nums[aPt]*nums[bPt]*nums[n]);
	  aPt++;
	  bPt++;
	   
   }
	
	return p;
        
    }

}
