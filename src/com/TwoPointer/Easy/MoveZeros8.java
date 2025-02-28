package com.TwoPointer.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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
   
   
   public void moveZero_java8(int nums[])
   {
	   
	   int[] nonZeroes = Arrays.stream(nums)
               .filter(num -> num != 0)
               .toArray();

// Fill the original array with non-zero elements
System.arraycopy(nonZeroes, 0, nums, 0, nonZeroes.length);

// Fill the rest of the array with zeroes
Arrays.fill(nums, nonZeroes.length, nums.length, 0);
	   
	   
   }

}
