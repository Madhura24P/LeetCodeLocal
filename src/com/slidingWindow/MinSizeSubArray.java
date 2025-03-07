package com.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinSizeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int nums[]= {2,3,1,2,4,3}; int target=7;
		 */
		int nums[]= {1,2,3,4,5};
		int target=11;
		minSubArrayLen(target, nums);

	}
	
	 public static int minSubArrayLen(int target, int[] nums) {
		 
		 int apt=0;
		 //int bpt=0;
		 int n=nums.length;
		 List<List<Integer>> resSubList=new ArrayList<>();
		 
		List<Integer> listNum=Arrays.stream(nums).boxed().collect(Collectors.toList());
		listNum.stream().forEach(x -> {
			int bpt=listNum.indexOf(x);
			int target_1=0;
			List<Integer> subList=new ArrayList<>();
			while(target_1<=target && bpt<n)
			{
				target_1=target_1+nums[bpt];
				subList.add(nums[bpt]);
				bpt++;
				
				
	     	}
			if(target_1>=target)
			{
				resSubList.add(subList);
			}
			
			
		});
		
		System.out.println(resSubList);
		int minSize=Integer.MAX_VALUE;
		for(List<Integer> nList:resSubList)
		{
			minSize=Math.min(nList.size(), minSize);
			
		}
		
		if(resSubList.size()>0)
		{
			return minSize;
		}
		
		return 0;
	        
	    }
	 
	 
	 public static int opt(int target,int[] nums)
	 {
		 int minLen = Integer.MAX_VALUE;
	        int left = 0;
	        int curSum = 0;

	        for (int right = 0; right < nums.length; right++) {
	            curSum += nums[right];

	            while (curSum >= target) {
	                if (right - left + 1 < minLen) {
	                    minLen = right - left + 1;
	                }
	                curSum -= nums[left];
	                left++;
	            }
	        }
	        
	        return minLen != Integer.MAX_VALUE ? minLen : 0; 
	 }

}
