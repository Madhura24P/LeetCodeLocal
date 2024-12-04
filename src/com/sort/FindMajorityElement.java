package com.sort;

import java.util.*;

public class FindMajorityElement {
	
	public static void main(String[] args) {
		int nums[]= {1000000000,1000000000,-1000000000,-1000000000,-1000000000};
		majorityElement(nums);
	}
	
	
	//Brute Force
public static int majorityElement(int[] nums) {
	
	int major=Integer.MIN_VALUE;
	Arrays.sort(nums);
	int threshhold=nums.length/2;
	
	
	Map<Integer,Integer> numsMap=new LinkedHashMap<>();
	for(int i=0;i<nums.length;i++)
	{
		if(numsMap.containsKey(nums[i]))
		{
			numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0)+1);
		}
		else
		{
			numsMap.put(nums[i], 1);
		}
	}
	
	System.out.println(numsMap);
	System.out.println(threshhold);
	 
	for(Map.Entry<Integer, Integer> e:numsMap.entrySet())
	{
		if(e.getValue()>threshhold)
		{
			major=Math.max(major, e.getKey());
			threshhold=e.getValue();
		}
	}
	
	
	System.out.println(major);
	return major;
        
    }



//Optimized
//1. assign candidate element 
//2. check its count
public static int majorityElementOpt(int[] nums) {
	  int candidate = 0, count = 0;
	  for (int num : nums) {
	   if (count == 0) {
	    candidate = num;
	   }
	   count += (num == candidate) ? 1 : -1;
	  }
	  return candidate;
	 }

}