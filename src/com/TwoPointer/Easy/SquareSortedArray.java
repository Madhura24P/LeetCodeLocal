package com.TwoPointer.Easy;

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

}
