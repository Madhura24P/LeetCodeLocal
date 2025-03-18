package com.sort;

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

}
