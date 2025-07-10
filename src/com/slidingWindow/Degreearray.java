package com.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Degreearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,2,3,1};
		findShortestSubArray(nums);
		

	}
	
	 public static int findShortestSubArray(int[] nums) {
		 
		 int degree=calcDegree(nums);
		 
		 int l=0;int r=0; int minLen=Integer.MAX_VALUE;
		 List<Integer> curr=new ArrayList();
		 while(r<nums.length)
		 {
			
			 curr.add(nums[r]);
			 
			 if(degree==calcDegree(curr.stream().mapToInt(x->x).toArray()))
			 {
				 minLen=Math.min(r-l+1, minLen);
				 l=l+1;
				 r=l;
				 curr=new ArrayList();
			 }else
			 {
				 r=r+1;
			 }
			 
			 
		 }
		 
		 return minLen;
	        
	    }
	 
	 private static int calcDegree(int nums[])
	 {
		 if(nums.length==0)
		 {
			 return 0;
		 }
		 long degree=Arrays.stream(nums).mapToObj(Integer::valueOf).
				 collect(Collectors.groupingBy(
						 Function.identity(),Collectors.counting()
						 )).entrySet().stream().
				  sorted(Map.Entry.<Integer,Long>comparingByValue().
						reversed()).findFirst().get().getValue();
		 
		 return (int)degree;
	 }

	 
	 public int findShortestSubArrayOpt(int []nums)
	 {
	        HashMap<Integer,Integer> count=new HashMap<>();
	        for(int i:nums){
	            count.put(i,count.getOrDefault(i,0)+1);
	        }
	        int maxcount=Integer.MIN_VALUE;
	        for(int j:count.keySet()){
	            maxcount=Math.max(maxcount,count.get(j));
	        }
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        int windowsize=Integer.MIN_VALUE;
	        int res=Integer.MAX_VALUE;
	        int i=0,j=0;
	        while(j<nums.length){
	            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
	            windowsize=Math.max(windowsize,hm.get(nums[j]));
	            while(windowsize==maxcount){
	                res=Math.min(res,j-i+1);
	                hm.put(nums[i],hm.get(nums[i])-1);
	                if(hm.get(nums[i])==0)
	                    hm.remove(nums[i]);
	                if(nums[i]==nums[j])
	                    windowsize--;
	                i++;
	            }
	            j++;
	        }
	        return res;

	 }
}
