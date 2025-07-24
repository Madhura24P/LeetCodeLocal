package com.DP;

import java.util.Arrays;

public class PartitionArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean canPartition(int[] nums) {

        int total = Arrays.stream(nums).sum();
      if (total % 2 != 0) return false;

      int target = total / 2;
      boolean[] dp = new boolean[target + 1];
      dp[0] = true;

      for (int num : nums) {
          for (int i = target; i >= num; i--) {
              dp[i] = dp[i] || dp[i - num];
          }
      }

      return dp[target];
      
  }

}
