package com.slidingWindow;

public class MaxConsOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,0,1,1,0,1};
		findMaxConsecutiveOnes(nums);

	}
	
public static int findMaxConsecutiveOnes(int[] nums) {
	int count=0;
	int maxCount=0;
	int apt=0;
	int bpt=apt;
	while(apt<nums.length)
	{
		while(bpt<nums.length)
		{
			if(nums[bpt]==1)
			{
				count++;
				bpt++;
			}else
			{
				
				//count=0;
				break;
			}
		}
		maxCount=Math.max(count,maxCount);
		count=0;
		apt=bpt+1;
		bpt=apt;
		
		
	}
	
	System.out.println(maxCount);
	return count;
        
    }

}
