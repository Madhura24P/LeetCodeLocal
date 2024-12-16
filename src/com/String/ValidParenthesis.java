package com.String;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		System.out.println(isValid(s));

	}
	
	 public static boolean isValid(String s) {

	        
	        Stack<Character> st=new Stack();
	        
	        for(char c:s.toCharArray())
	        {
	            if(c=='(')
	            {
	                 st.push(')');

	            }else if( c=='{')
	            {
	                  st.push('}');
	            }else if(c=='[')
	            {
	                  st.push(']');
	            }else if (st.isEmpty()||st.pop()!=c)
	            {
	                return false;
	            }
	        }

	            return st.isEmpty();
	        
	        
	    }

}
