package com.String;

public class MinBinaryAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minOperations(String s) {
		
		 int n=s.length();
		 
		 int start_with_0=0;//0101..
		 int start_with_1=0;//1010..
		 
		 for(int i=0;i<n;i++)
		 {
			 if(i%2==0)
			 {
				 if(s.charAt(i)=='0')
				 {
					 start_with_1++;
				 }else
				 {
					 start_with_0++;
				 }
			 }else
			 {
				 if(s.charAt(i)=='0')
				 {
					 start_with_0++;
				 }else
				 {
					 start_with_1++;
				 }
			 }
		 }
		 
		 return Math.min(start_with_0, start_with_1);
	        
	    }
	 

}
