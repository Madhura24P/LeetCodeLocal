package com.Array;

public class CountOddIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countOdds(21, 22);

	}
	
	 public static int countOdds(int low, int high) {
		 int count=0;
	        if(low%2==0 && high%2==0)
			 {
				 //count=count+2;
				 int n=(high-low)/2;
				 count=n;
				
				 
			 }
			
			if(low%2!=0 && high%2!=0)
			 {
				 count=count+2;
				 int n=((high-low))/2;
				 count=count+n-1;
				
				 
			 }

	         if((low%2!=0 && high%2==0)|| (low%2==0 && high%2!=0))
			 {
				 count=count+1;
				 int n=((high-low))/2;
				 count=count+n;
				
				 
			 }
	         return count; 
	    }
	 
	 
	 public int countOddsOpt(int low, int high) {
	       int nums=high-low+1;  //counting total numbers in range
	 
			if(low%2!=0 && high%2!=0)  
	            return nums/2 + 1;
	        
	        else
			return nums/2;
	    }

}
