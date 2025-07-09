package com.stack;

public class RemoveParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String removeOuterParentheses(String s) {
		 
		 int len=s.length();
		 if(len<=2)
		 return "";
		 
		
		 StringBuilder newString = new StringBuilder();
	     int open = 0;
	     
	     for(char c:s.toCharArray())
	     {
	    	 if((c=='(' && open++>0) || 
	    		(c==')' && open-->1) )
	    	 {
	    		newString.append(c);
	    	 }
	     }
		 
		
	        return newString.toString();
	    }

}
