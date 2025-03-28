package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveduplicatesSortArray_2 {
	
	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3};
		//int k=removeDuplicates(nums);
		int k=remDup_2_java8(nums);
		System.out.println(k);
	
	}
	
	 public static int removeDuplicates(int[] nums) {
		 int k = 2;

	        for (int i = 2; i < nums.length; i++) {
	            if (nums[i] != nums[k - 2]) {
	                nums[k] = nums[i];
	                k++;
	            }
	        }

	        return k; 
	        
	    }
	 
	 
	 public static int remDup_2_java8(int []nums)
	 {
		 List<Integer> numList=Arrays.stream(nums).boxed().toList();
		 List<Integer> resList=new ArrayList<>();
		 numList.stream().
		 collect(
		  Collectors.groupingBy(
			Function.identity(),LinkedHashMap::new,Collectors.counting()
			)).entrySet().stream().forEach(e -> {
				if(e.getValue()>=2)
				{
					int k=2;
					while(k>0)
					{
						resList.add(e.getKey());
						k--;
					}
				}else
				{
					resList.add(e.getKey());
				}
			});;
			
			System.out.println(resList);
			return resList.size();
		 
	 }

}
