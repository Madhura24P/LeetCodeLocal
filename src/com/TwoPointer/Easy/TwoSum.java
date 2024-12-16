package com.TwoPointer.Easy;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,7,11,15};
		int target = 9;
		
		twoSum(nums, target);

	}
	
public static int[] twoSum(int[] nums, int target) {
	Map<Integer,Integer> mapElements=new HashMap<>();
	
	int [] result=new int[2];
	int index=0;
	for(int n:nums)
	{
		if(mapElements.containsKey(target-n))
		{
			result[1]=index;
			result[0]=mapElements.get(target-n);
		}else
		{
			mapElements.put(n, index);
		}
		index++;
	}
	
	System.out.println(Arrays.toString(result));
     return result;
    }

}
