package com.search;

import java.util.Arrays;

public class MagneticForce_aggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxDistance(int[] position, int m) {
		 
		 Arrays.sort(position);
		 int low=0;
		 int high=position[position.length-1] -position[0];
		 
		 while(low<=high)
		 {
			 int mid=(low+high)/2;
			 if(canPlaceBalls(position, mid, m))
			 {
				 low=mid+1;
			 }else
			 {
				 high=mid-1;
			 }
		 }
		 
		 return high;
	        
	    }
	 
	 private boolean canPlaceBalls(int []positions,int mid,int balls)
	 {
		 int cntBalls=1;
		 int last =positions[0];
		 
		 for(int i=0;i<positions.length;i++)
		 {
			 if(Math.abs(positions[i]-last)>=mid)
			 {
				 cntBalls++;
				 last=positions[i];
			 }
			 
			 if(cntBalls==balls)
				 return true;
		 }
			 
			 return false;
		 }
	 

}
