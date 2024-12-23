package com.Array;

public class PeakMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,5,5};
		validMountainArray(nums);
		

	}
	
	 public static boolean validMountainArray(int[] arr) {
		 		
		 if(arr.length < 3) return false;
	        int l = 0;
	        int r = arr.length - 1;
	        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
	        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
	        
	        System.out.println(l==r);
	        return l == r;
	        
	    }

}

