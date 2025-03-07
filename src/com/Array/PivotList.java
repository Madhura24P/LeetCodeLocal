package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PivotList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {9,12,5,10,14,3,10};
int pivot=10;
pivotArray(nums, pivot);
	}
	
	 public static void pivotArray(int[] nums, int pivot) {
		 
		 int n=nums.length;
		 List<Integer> less=new ArrayList<>();
		 List<Integer> eq=new ArrayList<>();
		 List<Integer> mr=new ArrayList<>();
		 
		 Arrays.stream(nums).boxed().forEach(x-> {
			 if(x<pivot)
			 {
				 less.add(x);
			 }else if(x==pivot)
			 {
				 eq.add(x);
			 }else
			 {
				 mr.add(x);
			 }
		 });
	        
		 less.addAll(eq);
		 less.addAll(mr);
		 System.out.println(less);
		 
		 less.stream().mapToInt(x->x).toArray();
		 
	    }
	 
	 public static int[] opt(int nums[],int pivot)
	 {
		 int n=nums.length;
	        List<Integer> list=new ArrayList();
	        int idx=0;
	        int pivCnt=0;

	        // Traverse the array to count pivot elements and segregate elements
	        for(int i=0; i<n; i++){
	            if(nums[i]==pivot){
	                pivCnt++;
	            }
	            else if(nums[i]>pivot){
	                list.add(nums[i]);                
	            }
	            else{
	                nums[idx++]=nums[i];
	            }
	        }

	        // Insert pivot elements
	        for(int i=0; i<pivCnt; i++){
	            nums[idx++]=pivot;
	        }

	        // Append greater elements
	        for(int val:list){
	            nums[idx++]=val;
	        }
	        
	        return nums;
	 }

}
