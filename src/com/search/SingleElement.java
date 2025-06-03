package com.search;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int singleNonDuplicate(int[] nums) {
		 
		 List<Integer> numList=Arrays.stream(nums).boxed().
				 collect(Collectors.toList());
		 int single=numList.stream().collect(
				 Collectors.groupingBy(Function.identity(),Collectors.counting())
				 ).entrySet().stream().filter(x->x.getValue()==1).
		 map(x->x.getKey()).findFirst().get();
		 
		 return single;
	        
	    }
	 
	 public int singleElementOpt(int nums[])
	 {
		 int left=0;
		 int right=nums.length-1;
		 while(left<right)
		 {
			 int mid=left+(right-left)/2;
			 if(nums[mid]==nums[mid+1])
			 {
				 mid=mid-1;
			 }
			 
			 int leftLen=(mid-left)+1;
			 if(leftLen%2==1)
			 {
				 right=mid;
			 }else
			 {
				 left=mid+1;
			 }
		 }
		 
		 return nums[left];
	 }

}
