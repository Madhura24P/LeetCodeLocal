package com.KthSeries;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissingKthNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,7,11};
		findKthPositive(arr, 5);

	}
	
	 public static int findKthPositive(int[] arr, int k) {
		 for(int i : arr){
				if(i <= k) 
	            k++; 
	            
	            else
	            break;
			}
	        return k;

	 
	 }

}
