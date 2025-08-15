package com.bitManipulation;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public boolean isPowerOfTwo(int n) {
		  
		  if(n<=0) return false;
		  
		  if((n&(n-1))==0) return true;
		  
		  return false;
	        
	    }

}
