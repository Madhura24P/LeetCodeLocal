package com.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LargestPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-1,10,6,7,-7,1};
		LargestPositiveInteger l=new LargestPositiveInteger();
		l.findMaxKOpt(nums);

	}
	
	 public int findMaxK(int[] nums) {
		
		 Arrays.sort(nums);
		 List<Integer> listN=Arrays.stream(nums).boxed().toList();
		 
		 for(int n:nums)
		 {
			 if(n>0)
			 {
				 return -1;
			 }
			 
			 if(listN.contains(Math.abs(n)))
			 {
				 return Math.abs(n);
			 }
		 }
		 
		 return -1;
	        
	    }
	 
	 public int findMaxKOpt(int[] nums) {
			
		 Arrays.sort(nums);
		 
		 int i=0;
		 int j=nums.length-1;
		 while(i<j)
		 {
			if(Math.abs(nums[i])==Math.abs(nums[j]))
			{
				return nums[j];
			}else if(Math.abs(nums[i])<Math.abs(nums[j]))
			{
				j--;
			}else {
			
				i++;
			}
		 }
		 		 return -1;
	        
	    }


	 
	 public int findMaxKOpt2(int[] nums) {
		 
	        HashSet<Integer> hs = new HashSet<>();
	        int ans = -1;
	        for(int num : nums){
	            hs.add(num);
	            int k = num*(-1);
	            if(hs.contains(k)){
	                ans = Math.max(ans,Math.abs(num));
	            }
	        }
	        return ans;

			
	 }
}
