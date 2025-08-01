package com.DP;

import java.util.Arrays;

public class PerfectSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int numSquares(int n) {
        int[] arr = new int[10001]; //size is taken by observing the constrains.
         Arrays.fill(arr, -1);
         return calculateSquares(n, arr);
     }


      private int calculateSquares(int n, int[] arr){
         if(n == 0) return 0;

         if(arr[n] != -1){
             return arr[n];
         }

         int minValue = Integer.MAX_VALUE;
         for(int i = 1; (i * i) <= n; i++){
             int result = 1 + calculateSquares(n - (i * i), arr);

             minValue = Math.min(minValue, result);
         }
         return arr[n] = minValue;
     }

}
