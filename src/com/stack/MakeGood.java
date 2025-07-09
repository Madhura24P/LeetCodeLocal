package com.stack;

import java.util.Stack;

public class MakeGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leEeetcode";
		makeGood(s);

	}
	
	  public static  String makeGood(String s) {
		  
		  Stack<String> st=new Stack<>();
		  StringBuilder res=new StringBuilder();
		  for(char c:s.toCharArray())
		  {
			  if(st.isEmpty())
			  {
				  st.push(Character.toString(c));
			  }else
			  {
				  if(
					 st.peek().equals(Character.toString(c).toUpperCase()) ||
					 st.peek().toUpperCase().equals(Character.toString(c))
					 )
				  {
					  st.pop();
				  }else
				  {
					  st.push(Character.toString(c));
				  }
			  }
		  }
		  
		  while(!st.isEmpty())
		  {
			  res.append(st.pop());
		  }
		  return res.reverse().toString();
	        
	    }
	  
	  
	  public String  optMakeGood(String s)
	  {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : s.toCharArray()) {
	            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
	                stack.pop();
	            } else {
	                stack.push(c);
	            }
	        }
	        
	        StringBuilder result = new StringBuilder();
	        while (!stack.isEmpty()) {
	            result.insert(0, stack.pop());
	        }
	        
	        return result.toString();

	  }

}
