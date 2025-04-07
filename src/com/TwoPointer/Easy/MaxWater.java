package com.TwoPointer.Easy;

public class MaxWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxArea(int[] height) {
		 int apt=0;
		 int bpt=height.length-1;
		 int maxarea=0;
		 
		 while(apt<bpt)
		 {
			 int ht=Math.min(height[apt], height[bpt]);
			 int area=ht*((bpt-apt));
			 if(area>maxarea)
			 {
				 maxarea=area;
			 }
			 
			 if(height[apt]<height[bpt])
			 {
				 apt++;
			 }else
			 {
				 bpt--;
			 }
			 
		 }
		 
		 return maxarea;
	        
	    }
	 
	 
	 //2 points 
	 //start point: 0 - last pt: n
	 //area=min {h(0),h(n)} * (n-0)
	 // Max=Maths
	 //

}
