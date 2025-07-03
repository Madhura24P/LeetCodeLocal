package com.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TargetIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {100,1,100};
		targetIndices(nums, 100);
		

	}
	
	 public static List<Integer> targetIndices(int[] nums, int target) {
		 Arrays.sort(nums);
		 List<Integer> targetList=new ArrayList<Integer>();
		 if(nums.length==1 && nums[0]!=target)
		 {
			 return targetList;
		 }else if(nums.length==1 && nums[0]==target)
		 {
			 targetList.add(0);
			 return targetList;
		 }
		 
		 int start=0;
		 int end=nums.length-1;
		 int firstIndex=0;
		 
		 while(start<end)
		 {
			 int mid=start+(end-start)/2;
			 
			 if(nums[mid]<target)
			 {
				 start=mid+1;
			 }else
			 {
				 end=mid;
			 }
		 }
		 
		  firstIndex=start;
		  end=nums.length-1;
		  int lastIndex=firstIndex;
		  
		  while(start<=end)
			 {
				 int mid=start+(end-start)/2;
				 
				  if(nums[mid]<=target)
				 {
					 start=mid+1;
				 }else
				 {
					 end=mid-1;
				 }
			 }
		  
		  lastIndex=start;
		 
		 if(firstIndex==lastIndex && nums[firstIndex]==target)
		 {
			 targetList.add(firstIndex);
		 }
	        
		 if(nums[firstIndex]==target && nums[lastIndex-1]==target)
		 {
		 for(int i=firstIndex;i<lastIndex;i++)
		 {
			 targetList.add(i);
		 }
		 }
		 
		 
		 System.out.println(targetList);
		 return targetList;
	    }
	 
	 
	 public List<Integer> targetIndicesOpt(int[] nums, int target) {
	       List<Integer> result=new ArrayList<>();
	        Arrays.sort(nums);
	        int n=nums.length;
	        for(int i=0;i<n;i++){
	            if(nums[i]==target){
	                result.add(i);
	            }
	        }
	        return result;
	    }

}
