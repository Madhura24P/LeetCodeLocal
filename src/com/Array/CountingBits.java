package com.Array;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] countBits(int n) {
		 
		 int [] res=new int[n+1];
		 
		 for(int i=0;i<=n;i++)
		 {
			 res[i]=countOne(n);
		 }
		 
		 return res;
	        
	    }
	 
	 private int countOne(int n)
	 {
		 int count=0;
		 for(int i=0;i<32;i++)
		 {
			 if(((n>>i) &1)==1)
			 {
				 count++;
			 }
		 }
		 
		 return count;
	 }
	 
	 
	 public int[] countBitsOpt(int n) {
	        int[] ans = new int[n + 1];
	        for (int i = 1; i <= n; i++) {
	            ans[i] = ans[i >> 1] + (i & 1);
	        }
	        return ans;
	    }

}
