package com.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubSeqTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3,4);
		//lengthOfLongestSubsequence(l, 5);
		

	}
	
	  int[][] dp;
	    public  int lengthOfLongestSubsequence(List<Integer> nums, int target) {
	        int v[]=nums.stream().mapToInt(x->x).toArray();
	        int t=target;
	         int n = v.length;
	        dp = new int[n + 1][t + 1];
	        for (int[] row : dp)
	        Arrays.fill(row, -1);
	        int ans = solve(0, v, t);
	        if (ans <= 0)
	            return -1;
	        return ans;



	    }


	     public int solve(int i, int[] v, int t) {
	        if (t == 0)
	            return 0;
	        if (t < 0 || i >= v.length)
	            return Integer.MIN_VALUE;
	        if (dp[i][t] != -1)
	            return dp[i][t];
	        int a = 1 + solve(i + 1, v, t - v[i]);
	        int b = solve(i + 1, v, t);
	        return dp[i][t] = Math.max(a, b);
	    }

}
