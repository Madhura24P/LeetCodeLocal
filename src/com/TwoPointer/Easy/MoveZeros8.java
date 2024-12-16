package com.TwoPointer.Easy;

import java.util.Arrays;

public class MoveZeros8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,0,3};
		moveZeroes(nums);

	}
	
   public static void moveZeroes(int[] nums) {
        int p1=0;
        int p2=1;
        while(p2<nums.length)
        {
        	if(nums[p1]==0 && nums[p2]!=0)
        	{
        		int temp=nums[p1];
        		nums[p1]=nums[p2];
        		nums[p2]=temp;
        		p1++;
        		p2++;
        		
        	}else if(nums[p1]!=0)
        	{
        		p1++;
        		p2++;
        	}else
        	{
        		p2++;
        	}
        }
        
        System.out.println(Arrays.toString(nums));
    }

}
