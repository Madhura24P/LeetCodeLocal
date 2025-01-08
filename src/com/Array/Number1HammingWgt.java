package com.Array;

public class Number1HammingWgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int hammingWeight(int n) {
		 
		 int c=0;
		 while(n>0)
		 {
			 int d=n%2;
			 if(d==1)
			 {
				 c++;
			 }
			 n=n/2;
		 }
		 
		 
		 return c;
	        
	    }
	 
	 public int hammingWeightOpt(int n) {
	        int res = 0;
	        for (int i = 0; i < 32; i++) {
	            if (((n >> i) & 1) == 1) {
	                res += 1;
	            }
	        }
	        return res;        
	    }

}
