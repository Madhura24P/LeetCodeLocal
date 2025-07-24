package com.DP;

import java.util.Arrays;

public class MinDiffPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumDifference(int[] nums) {
		
		int totalSum=Arrays.stream(nums).sum();
		int n=nums.length-1;
		
	    boolean dp[][]=new boolean [n][totalSum+1];
	    
	    for(int i=0;i<n;i++)
	    {
	    	dp[i][0]=true;
	    }
	    if(nums[0]<=totalSum) dp[0][nums[0]]=true;
	    
	    for(int ind=1;ind<n;ind++)
	    {
	    	for(int target=1;target<=totalSum;target++)
	    	{
	    		
	    		boolean noTake=dp[ind-1][target];
	    		boolean Take=false;
	    		if(nums[ind]<=target)
	    		{
	    			Take=dp[ind-1][target-nums[ind]];
	    		}
	    		
	    		dp[ind][target]=Take||noTake;
	    		
	    	}
	    }
	    
	    int mini=Integer.MAX_VALUE;
	    for(int  i=0;i<=totalSum/2;i++)
	    {
	    	if(dp[n-1][i]==true)
	    	{
	    		mini=Math.min(mini, Math.abs((totalSum-i)-i));
	    	}
	    }

	    return mini;
	}

}
