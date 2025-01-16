package com.Array;

import java.util.*;

public class GoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,1,1,3};
		numIdenticalPairs(nums);

	}
	
	 public static int numIdenticalPairs(int[] nums) {
		 Map<Integer,List<Integer>> map=new HashMap<>();
		 //Map<Integer, List<Integer>> mem=new HashMap<>();
		 int cnt=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(map.containsKey(nums[i]))
			 {
				 List<Integer> l_ind=map.get(nums[i]);
				 for(int n:l_ind)
				 {
					 if(n<i)
					 {
						 System.out.println(n+" "+i);
						 cnt++;
					 }
				 }
				 
				 l_ind.add(i);
				 map.put(nums[i], l_ind);
				 
			 }
			 else
			 {
				 List<Integer> l=new ArrayList<>();
				 l.add(i);
				 map.put(nums[i],l);
			 }
		 }
		 
		 return cnt;
	        
	    }
	 
	 public int numIdenticalPairsOpt(int[] A) {
	        int ans = 0, cnt[] = new int[101];
	        for (int a: A) {
	            ans += cnt[a]++;
	        }
	        return ans;
	    }

}
