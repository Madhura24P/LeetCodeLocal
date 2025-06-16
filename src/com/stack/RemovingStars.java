package com.stack;

import java.util.Stack;

public class RemovingStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
	
	for(char c:s.toCharArray())
	{
		if(c!='*')
		{
			st.push(c);
		}else
		{
			st.pop();
		}
		
	}
	
	StringBuilder sb=new StringBuilder();
	while(!st.isEmpty())
	{
		sb.append(st.pop());
	}
	
        return sb.reverse().toString();
    }

}
