package com.Array;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int hammingDistance(int x, int y) {
	        int count=0;

	        for(int i=0;i<32;i++)
	        {
	            int x_i=(x>>i)&1;
	            int y_i=(y>>i)&1;
	            if(x_i!=y_i)
	            {
	               count++;

	            }

	        }
	        return count;
	    }

}
