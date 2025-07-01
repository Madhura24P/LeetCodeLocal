package com.TwoPointer.Easy;

public class DuplicateZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,0,2,3,0,4,5,0};
		duplicateZerosOpt(arr);

	}
	
	 public void duplicateZeros(int[] arr) {
		  int ans[]=new int[arr.length];
			 int pt=0;
			 for(int i:arr)
			 {
				 if(i!=0 && pt<arr.length)
				 {
					 ans[pt]=i;
					 pt++;
				 }else
				 {
					 pt=pt+2;
				 }

	             if(pt==arr.length)
	             {
	                break;
	             }
				 
			 }
			 
			 for(int j=0;j<ans.length;j++)
			 {
				 arr[j]=ans[j];
			 }
		 
	    }


	 static void duplicateZerosOpt(int[] arr) {
	        int n = arr.length, count = 0;

	        for (int num : arr) {
	            if (num == 0) {
	                count++;
	            }
	        }
	        int i = n - 1;
	        int j = n + count - 1;

	        while (i >= 0 && j >= 0) {

	            if (arr[i] != 0) {
	                if (j < n) {
	                    arr[j] = arr[i];
	                }

	            } else {
	                if (j < n) {
	                    arr[j] = arr[i];
	                }
	                j--;
	                if (j < n) {
	                    arr[j] = arr[i];
	                }
	            }

	            i--;
	            j--;
	        }
	    }

}
