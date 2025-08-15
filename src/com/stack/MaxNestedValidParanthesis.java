package com.stack;

public class MaxNestedValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int maxDepth(String s) {
		 
		 int n=s.length();
		 int count=0;
		 int MaxCount=0;
		 for(int i=0;i<n;i++)
		 {
			 if('('==s.charAt(i))
			 {
				 count++;
				 MaxCount=Math.max(MaxCount, count);
			 }else if(')'==s.charAt(i))
			 {
				 count--;
			 }
			 
		 }
	        return MaxCount;
	    }
}
