package com.sort;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] transpose(int[][] matrix) {
		 
		 int n=matrix.length;
		 int m=matrix[0].length;
		 int [][]res=new int[m][n];
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 res[j][i]=matrix[i][j];
			 }
		 }
	        return res;
	    }

}
