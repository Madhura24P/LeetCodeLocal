package com.search;

public class KthMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,7,11};
		int k=5;
		findKthPositiveOpt(arr, k);

	}
	
	 public int findKthPositive(int[] arr, int k) {
	       for(int i : arr){
				if(i <= k) 
	            k++; 
	            
	            else
	            break;
			}
	        return k;

	       
	          }
	 
	 public static int findKthPositiveOpt(int[] arr, int k) {
		 
		 int low=0;
		 int high=arr.length-1;
		 
		 while(low<=high)
		 {
			 int mid=low+(high-low)/2;
			 int missing=arr[mid]-(mid+1);
			 
			 if(missing<k)
			 {
				 low=mid+1;
			 }else
			 {
				 high=mid-1;
			 }
		 }
		 
	     return high+1+k;
	       
	          }

}
