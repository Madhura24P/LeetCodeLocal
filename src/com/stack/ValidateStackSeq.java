package com.stack;

import java.util.Stack;

public class ValidateStackSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean validateStackSequences(int[] pushed, int[] popped) {
		 int j=0;
		 Stack<Integer> st=new Stack<>();
		 for(int i:pushed)
		 {
			 st.push(i);
			 
			 while(!st.isEmpty() && j<popped.length && 
					 st.peek()==popped[j])
			 {
				 st.pop();
				 j++;
			 }
			 
		 }
		 
		 return j==popped.length;
	        
	    }

}
