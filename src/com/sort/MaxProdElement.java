package com.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProdElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {3,4,5,2};
		
		int largest=Arrays.stream(nums).boxed().
				sorted(Comparator.reverseOrder()).findFirst().get();
		
		int slargest=Arrays.stream(nums).boxed().
				sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		//System.out.println(largest+":"+slargest);
		
		int prod=(largest-1)*(slargest-1);
		
		//optimized 56%
		Arrays.sort(nums);
		prod=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
		
		
		//perfect 100%
		 int max1 = Integer.MIN_VALUE;
	        int max2 = Integer.MIN_VALUE;

	        for (int num : nums) {
	            if (num >= max1) {
	                max2 = max1;
	                max1 = num;
	            } else if (num > max2) {
	                max2 = num;
	            }
	        }

	        prod= (max1 - 1) * (max2 - 1);

	}

}
