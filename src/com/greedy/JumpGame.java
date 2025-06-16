package com.greedy;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean canJump(int[] nums) {
	
	int max=nums[0];
	int n=nums.length;
	int maxLength=nums.length-1;
	
	if(n==1)
	{
		return true;
	}
	for(int i=1;max>=i;i++)
	{
		if(max>=maxLength)
		{
			return true;
		}
		max=Math.max(max, i+nums[i]);
	}
	
	return false;
        
    }

}
