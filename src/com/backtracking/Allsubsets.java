package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Allsubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]= {1,2,3};
subsets(n);
	}
	
	 public static List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> res = new ArrayList<>();
	        List<Integer> subset = new ArrayList<>();

	        createSubset(nums, 0, res, subset);
	        return res;        
	    }
	 
	 private static void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
	        if (index == nums.length) {
	            res.add(new ArrayList<>(subset));
	            return;
	        }

	        subset.add(nums[index]);
	        createSubset(nums, index + 1, res, subset);

	        subset.remove(subset.size() - 1);
	        createSubset(nums, index + 1, res, subset);
	    }    

}
