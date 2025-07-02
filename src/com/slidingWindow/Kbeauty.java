package com.slidingWindow;

public class Kbeauty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int divisorSubstrings(int num, int k) {
		 String s=Integer.toString(num);
		 int total=0;
		 
		 for(int i=0;i<s.length() && i+k<=s.length();i++)
		 {
			 String tempS=s.substring(i, i+k);
			 int temp=Integer.parseInt(tempS);
			 if(temp!=0 && num%temp==0)
			 {
				 total++;
			 }
		 }
	        
		 return total;	    }

}
