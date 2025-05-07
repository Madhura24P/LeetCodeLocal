package com.Array;

import java.util.Arrays;

public class MeanArrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5};
		
		 Arrays.sort(arr);
	        int redundant = (int) (arr.length * 0.05);
	        int sum = 0;
	        for (int i = redundant; i < (arr.length - redundant); i++) {
	            sum += arr[i];
	        }
	        double mean= sum / (arr.length - redundant * 2.0);

	}

}
