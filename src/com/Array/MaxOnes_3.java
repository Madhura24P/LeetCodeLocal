package com.Array;

public class MaxOnes_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]= {1,1,1,0,0,0,1,1,1,1,0};k=2
		int nums[]= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		
		int k = 3;
		longestOnes(nums, k);		


	}
	
public static int longestOnes(int[] nums, int k) {
	
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


public int longestOnesOpt(int[] nums, int k) {
    int left = 0, maxLength = 0, zeroCount = 0;
    for (int right = 0; right < nums.length; ++right) {
        if (nums[right] == 0) {
            zeroCount++;
        }
        while (zeroCount > k) {
            if (nums[left] == 0) {
                zeroCount--;
            }
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}



}
