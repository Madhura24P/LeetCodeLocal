package com.search;

public class SearchIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean searchMatrix(int[][] matrix, int target) {
		 
		 int low=0;
		 int high=(matrix.length*matrix[0].length)-1;
		 int m=matrix[0].length;
		 
		 while(low<=high)
		 {
			 int mid=low+(high-low)/2;
			 int row=mid/m;
			 int col=mid%m;
			 if(target==matrix[row][col])
			 {
				 return true;
			 }else if(target>matrix[row][col])
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
