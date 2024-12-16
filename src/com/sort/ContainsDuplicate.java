package com.sort;

import java.util.*;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,1};
		//print
		System.out.println("flag:"+containsDuplicate(nums));

	}
	
	 public static boolean containsDuplicate(int[] nums) {
	     boolean flag=false;
		 Set<Integer> s=new HashSet<>();
		 for(int i:nums)
		 {
			 if(s.contains(i))
			 {
				 return true;
			 }
			 s.add(i);
		 }
		 
		 
		 return flag;
	    }

}
