package com.Array;

import java.util.*;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
		 Map<Integer,Integer> indexMap=new HashMap<>();
		 int indx=0;
		 for(int n:nums)
		 {
			 if(indexMap.containsKey(n))
			 {
				 int prev=indexMap.get(n);
				 if(indx-prev<=k)
				 {
					 return true;
				 }else
				 {
					 indexMap.put(n, indx);
				 }
				 
			 }else
			 {
				 indexMap.put(n, indx);
			 }
			 indx++;
		
		 }
		 
		 return false;
	        
	    }
	 
	 public boolean containsNearbyDuplicateOpt(int[] nums, int k) {
	        Map<Integer, Integer> seen = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int val = nums[i];
	            if (seen.containsKey(val) && i - seen.get(val) <= k) {
	                return true;
	            }
	            seen.put(val, i);
	        }

	        return false;        
	    }

}
