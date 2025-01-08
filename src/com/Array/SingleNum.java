package com.Array;

import java.util.*;

public class SingleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int singleNumber(int[] nums) {
		 int res=0;
		 
		 Map<Integer,Integer> map=new HashMap<>();
		 
		 for(int c:nums)
		 {
			 
				 map.put(c, map.getOrDefault(c, 0)+1);
			 
		 }
		 
		 for(Map.Entry<Integer, Integer> e:map.entrySet())
		 {
			 if(e.getValue()==1)
			 {
				 res=e.getKey();
			 }
		 }
		 
		 return res;
	        
	    }
	 
	 public int singleNumberOpt(int[] nums) {
	        int result = 0;
	        for (int num : nums) {
	            result ^= num;
	        }
	        return result;
	    }

}
