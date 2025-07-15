package com.search;

public class Search2D_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean searchMatrixOpt(int[][] matrix, int target) {
		 
		 int n=matrix.length;
		 int m=matrix[0].length;
		 
		 int row=0,col=m-1;
		 
		 while(row<n && col>=0)
		 {
			 if(matrix[row][col]==target)
			 {
				 return true;
			 }else if(matrix[row][col]<target)
			 {
				 row++;
			 }else col--;
		 }
		 
		 return false;
	    }

}
