package com.search;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[]= {1,3,2,4,1};
      //findDuplicate_8(nums);
      findDuplicate(nums);
	}
	
public static int findDuplicate(int[] nums) {
	Arrays.sort(nums);
	int low=0;
	int high=nums.length-1;
	
	while(low<high)
	{
		int mid=low+(high-low)/2;
		if(nums[mid]==nums[mid+1])
		{
			System.out.println(nums[mid]);
			return nums[mid];
		}
			if(nums[mid]>nums[mid-1])
			{
			   low=mid+1;
			}else
			{
				high=mid;
			}
		
	}
        return 0;
    }


public static int findDuplicate_8(int[] nums) {
	
	List<Integer> list=Arrays.stream(nums).boxed().toList();
	int dup=list.stream().collect(
			Collectors.groupingBy(Function.identity(),Collectors.counting())
			).entrySet().stream().filter(
					x -> x.getValue()>=2
					).map(x->x.getKey()).findFirst().get();
	System.out.println(dup);
	return dup;
    
}
}


