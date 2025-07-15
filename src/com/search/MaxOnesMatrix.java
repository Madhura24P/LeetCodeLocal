package com.search;

import java.util.Arrays;

public class MaxOnesMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[][]= {{1,1},{1,0}};
		rowAndMaximumOnes(num);

	}

	public static  int[] rowAndMaximumOnes(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int minIndx = 0;
		int maxCount = 0;
		int currCount = 0;

		for (int i = 0; i < n; i++) {
			
		if(firstOcc(mat[i], 1)>=0)
			{
				currCount = m - firstOcc(mat[i], 1);
			}

			

			if (currCount > maxCount) {
				maxCount = currCount;
				minIndx = i;
			}

		}
		
		int res[]= {minIndx,maxCount};

		return res;

	}

	private static  int firstOcc(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		Arrays.sort(arr);
		int ans = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= x) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}

}
