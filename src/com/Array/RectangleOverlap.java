package com.Array;

public class RectangleOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		 
		  if(rec2[0]<rec1[2] 
			         && 
			         rec2[2]>rec1[0])
					 {
						 if(rec2[1]<rec1[3] && rec2[3]>rec1[1]) {
							 return true;
							 
						}
					 }

			       
					 
			         //return false;
		 
		 
		 return false;
	        
	    }

}
