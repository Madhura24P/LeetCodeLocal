package com.search;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean checkIfExistOpt(int[] arr) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
	                return true;
	            }
	            set.add(num);
	        }
	        return false;
	    }
	
   public boolean checkIfExist(int[] arr) {
	   
	    Arrays.sort(arr);
		   int index=0;
		   for(int i:arr)
		   {
			   int target=i;
			   if(search(arr,2*target,index))
			   {
	               
				   return true;
			   }
	           index++;
		   }
		   
		   return false;
	    }

	     public boolean search(int[] arrT,int target,int index)
	   {
		   int low=0;
		   int high=arrT.length-1;
		   
		   while(low<=high)
		   {
			   int mid=low+(high-low)/2;
			   if(arrT[mid]==target)
			   {
	              return mid!=index?true:false;
			   }else if(arrT[mid]<target)
			   {
				  low=mid+1;   
			   }else
			   {
				   high=mid-1;
			   }
		   }
		   return false;
	   }
   
  
   
   

}
