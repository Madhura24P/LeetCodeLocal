package com.TwoPointer.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] sortedSquares(int[] nums) {
        int L=0;
		int R=nums.length-1;
		int index=nums.length-1;
		int res[]=new int[nums.length];
		while(L<=R)
		{
			if(Math.abs(nums[L])>Math.abs(nums[R]))
			{
				res[index]=nums[L]*nums[L];
				L++;
				
				
			}
			else 
			{
				res[index]=nums[R]*nums[R];
				R--;
				
			}
			
			index--;
        }

            return res;
        
    }
	
	
	public void sortSQ(int nums[])
	{
		
		List<Integer> sqList=Arrays.stream(nums).boxed().map(x->x*x).sorted().collect(Collectors.toList());
		sqList.stream().mapToInt(x->x).toArray();
		
		
	}

}
