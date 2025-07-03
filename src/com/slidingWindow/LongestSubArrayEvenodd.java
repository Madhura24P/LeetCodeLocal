package com.slidingWindow;

public class LongestSubArrayEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int longestAlternatingSubarray(int[] nums, int threshold) {
	        int n = nums.length, l = 0;

	        // Find the first nums[l] that satisfies all conditions
	        while ((l < n) && ((nums[l] % 2 == 1) || (nums[l] > threshold))) {
	            l++;
	        }
	        
	        // Case when nums.length == 1 and nums[0] is odd
	        if (l == n)     
	            return 0;

	        int maxLen = 1, r = l + 1, mod = 0;
	        while (r < n) {
	            mod = (r - l) % 2;
	            if (nums[r] > threshold 
	            || (mod == 1 && nums[r] % 2 == nums[l] % 2)   // Two consecutive elements have the same parity
	            || (mod == 0 && nums[r] % 2 != nums[l] % 2))  // Two consecutive elements have different parity
	            {
	                // Find the next nums[l] that satisfies all conditions
	                // because nums[r] does not satisfy
	                l = r;
	                while (l < n && (nums[l] > threshold || nums[l] % 2 == 1)) {
	                    l++;
	                }
	                r = l + 1;
	            } else {
	                maxLen = Math.max(maxLen, r - l + 1);
	                r++;
	            }
	        }

	        return maxLen;
	    }

}
