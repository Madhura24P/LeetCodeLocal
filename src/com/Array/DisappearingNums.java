package com.Array;

import java.util.*;

public class DisappearingNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,1};
		findDisappearedNumbers(nums);

	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	     List<Integer> res=new ArrayList<>(); 
	     Arrays.sort(nums);
	     int []numsCp=new int[nums.length+1];
	     int i=0;
	     while(i<nums.length )
	     {
	    	numsCp[nums[i]]++; 
	    	i++;
	     }
	     
	     //System.out.println(Arrays.toString(numsCp));
	     
	     for(int j=1;j<numsCp.length;j++)
	     {
	    	 if(numsCp[j]==0)
	    	 {
	    		 res.add(j);
	    	 }
	     }
	     
	     //System.out.println(res);
	     return res;
		 
	    }

}
