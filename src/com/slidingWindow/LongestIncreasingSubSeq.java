package com.slidingWindow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findLengthOfLCIS(int[] nums) {
		 
		 List<Integer> res=new ArrayList<>();
		 int n=nums.length;
		 for(int i=0;i<n;i++)
		 {
			 int j=i;
			 while(j<n-1 && nums[j]<nums[j+1])
			 {
				 j++;
			 }
			 res.add(j-i+1);
			 			 
		 }
		 
		 int maxLength=res.stream().max(Comparator.naturalOrder()).get();
	        return maxLength;
	    }

}
