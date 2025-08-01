package com.String;

public class LargestOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String largestOddNumber(String num) {
        int n=num.length();
         for(int i=n-1;i>=0;i--)
         {
        	 int t=num.charAt(i);
        	 if(t%2!=0)
        	 {
        		 return num.substring(0, i+1);
        	 }
             
         }
         
         return "";
         
     }

}
