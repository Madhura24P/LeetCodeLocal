package com.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxChunks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int maxChunksToSorted(int[] arr) {
		 int arrCpy[]=arr;
		 Arrays.sort(arr);
		 //List<Integer> arrListSorted=Arrays.stream(arr).boxed().collect(Collectors.toList());
		 
		 //List<Integer> arrList=Arrays.stream(arrCpy).boxed().collect(Collectors.toList());
		
		 int ans = 0;
	        int max = arr[0];
	        for (int i = 0; i < arr.length; i++) {
	            max = arr[i] > max ? arr[i] : max;
	            if (max == i) {
	                ans++;
	            }
	        }
	        return ans;
	        
	    }
	 
	 
	 
}
