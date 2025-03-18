package com.Array;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4,3,2,7,8,2,3,1};
		findDuplicates(nums);

	}
	
	 public static List<Integer> findDuplicates(int[] nums) {
		 
		 List<Integer> numList=Arrays.stream(nums).boxed().collect(Collectors.toList());
		 
		 List<Integer> res=numList.stream().collect(
				 Collectors.groupingBy(Function.identity(),Collectors.counting())
				 ).entrySet().stream().filter(x -> x.getValue()>1).
		 map(x->x.getKey()).collect(Collectors.toList());
		 System.out.println(res);
		 return res;
	        
	    }

}
