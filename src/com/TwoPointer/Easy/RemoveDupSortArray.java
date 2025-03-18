package com.TwoPointer.Easy;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class RemoveDupSortArray {
	
	public static void main(String[] args) {
		int[] nums= {1,1,2,3,3,4};
		//int k=removeDuplicates(nums);
		
		int nums2[]=Arrays.stream(nums).boxed().collect(
				Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()
						)
				).entrySet().stream().map(x->x.getKey()).
		        mapToInt(x->x).toArray();
		
		System.out.println(Arrays.toString(nums2));
	
	}
	
	 public static int removeDuplicates(int[] nums) {
		 
		 //count of uniq elements
		 int count=1;
		 //pointers to navigate
		 int a_pointer=1;
		
		 
		 while(a_pointer<nums.length)
		 {
			 if(nums[a_pointer]!=nums[count-1])
			 {
			     nums[count]=nums[a_pointer];
				count++;
			 }
			 a_pointer++;
			
		 }
		 System.out.println(Arrays.toString(nums));
		 	 
		 return count;
	        
	    }
	 
	 public void remDupl(int nums[])
	 {
		 
		 Set<Integer> numSet=Arrays.stream(nums).boxed().collect(Collectors.toSet());
		 numSet.size();
		 
	 }
	
}
